package docow.converter;


import docow.struct.ido.CaseDetailAddIDO;
import docow.struct.ido.CaseDetailIDO;
import docow.struct.ido.CaseQueryIDO;
import docow.struct.vo1.CaseDetailAddVO;
import docow.struct.vo1.CaseDetailVO;
import docow.struct.vo1.CaseQueryVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface CaseConverter {
    CaseQueryVO caseQueryIdoToVo(CaseQueryIDO caseQueryIDO);

    CaseDetailAddVO caseDetailIdoToVo(CaseDetailAddIDO caseDetailAddIDO);

    CaseDetailIDO caseDetailVoToIdo(CaseDetailVO caseDetailVO);

    List<CaseDetailAddVO> caseDetailIdoListToVoList( List<CaseDetailAddIDO> caseDetailAddIDO);

    List<CaseDetailIDO> caseDetailVoListToIDO(List<CaseDetailVO> caseDetailVOList);


}
