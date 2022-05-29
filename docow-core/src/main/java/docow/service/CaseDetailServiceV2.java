package docow.service;

import docow.Handler.model.CaseModel;
import docow.converter.CaseConverter;
import docow.converter.CaseResultConverter;
import docow.factory.CaseModelFactory;
import docow.repository.CaseDetailRepository;
import docow.repository.CaseResultRepository;
import docow.repository.UserDefineParamRepository;
import docow.struct.ido.ApiResultIDO;
import docow.struct.ido.CaseQueryIDO;
import docow.struct.ido.CaseReportIDO;
import docow.struct.vo1.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CaseDetailServiceV2 {

    private final CaseDetailRepository caseDetailRepository;
    private final CaseConverter caseConverter;
    private final CaseResultRepository caseResultRepository;
    private  final CaseResultConverter caseResultConverter;


    private final UserDefineParamRepository userDefineParamRepository;

    private final CaseModelFactory caseModelFactory;
    private final WebSocket webSocket;

    public CaseDetailServiceV2(CaseDetailRepository caseDetailRepository, CaseConverter caseConverter, CaseResultRepository caseResultRepository, CaseResultConverter caseResultConverter, UserDefineParamRepository userDefineParamRepository, CaseModelFactory caseModelFactory, WebSocket webSocket) {
        this.caseDetailRepository = caseDetailRepository;
        this.caseConverter = caseConverter;
        this.caseResultRepository = caseResultRepository;
        this.caseResultConverter = caseResultConverter;
        this.userDefineParamRepository = userDefineParamRepository;
        this.caseModelFactory = caseModelFactory;
        this.webSocket = webSocket;
    }


    public ApiResultIDO<CaseReportIDO> execute(CaseQueryIDO caseQueryIDO){
        CaseQueryVO caseQueryVO = caseConverter.caseQueryIdoToVo(caseQueryIDO);
        PageResultVO<CaseDetailVO> pageResultVO = caseDetailRepository.getCaseDetailListByCondition(caseQueryVO);

        List<CaseDetailVO> caseDetailVOS = pageResultVO.getList();
        List<CaseResultVO> caseResultList = new ArrayList<CaseResultVO>();
        //后期通过用户规则提取的变量
        List<UserDefineParamVO> ruleUserDefineParamVOS = new ArrayList<>();

        int passCount = 0;
        int failCount = 0;
        //初始化用户变量
        CaseModel caseModel = caseModelFactory.create()
                .initUserDefineParamMap(caseQueryVO);



        return ApiResultIDO.success(new CaseReportIDO());
    }
}
