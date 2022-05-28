package docow.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import docow.struct.ido.CaseResultIDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import docow.util.JsonUtil;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;


@Component
@ServerEndpoint("/webSocket")
@Slf4j
public class WebSocket {
    private Session session;

    private static CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        webSocketSet.add(this);
        log.info("【websocket消息】有新的连接, 总数:{}", webSocketSet.size());
    }

    @OnClose
    public void onClose() {
        webSocketSet.remove(this);
        log.info("【websocket消息】连接断开, 总数:{}", webSocketSet.size());
    }

    @OnMessage
    public void onMessage(String message) {
        log.info("【websocket消息】收到客户端发来的消息:{}", message);
    }

    public void sendMessage(List<CaseResultIDO> caseResultIDOList) {

        JsonUtil jsonUtil =new JsonUtil(new ObjectMapper());
        for (WebSocket webSocket: webSocketSet) {
            log.info("【websocket消息】广播消息, message={}",jsonUtil.toJson(caseResultIDOList));
            try {
                webSocket.session.getBasicRemote().sendText(jsonUtil.toJson(caseResultIDOList));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
