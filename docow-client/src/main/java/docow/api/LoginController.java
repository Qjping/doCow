package docow.api;

import docow.struct.ido.ApiResultIDO;
import docow.struct.ido.LoginQueryIDO;
import docow.struct.ido.LoginUserIDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import docow.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private  UserService userService;
    @Autowired
    private  HttpServletRequest request;
    private StringRedisTemplate redisTemplate;

//    public LoginController(UserAccountRepository userAccountRepository, UserService userService, HttpServletRequest request) {
//        this.userService = userService;
//        this.request = request;
//    }

    @PostMapping("login")
    public ApiResultIDO<LoginUserIDO> login(@RequestBody LoginQueryIDO loginQueryIDO){
        log.info(String.valueOf(loginQueryIDO));
        LoginUserIDO loginUserIDO = userService.login(loginQueryIDO);
        return ApiResultIDO.success(loginUserIDO);
    }
}
