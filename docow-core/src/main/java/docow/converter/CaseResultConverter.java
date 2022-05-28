package docow.converter;


import docow.struct.ido.CaseResultIDO;
import docow.struct.vo1.CaseResultVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper(componentModel = "spring")
public interface CaseResultConverter {

    CaseResultIDO caseResultVoToIDO(CaseResultVO caseResultVO);
    List<CaseResultIDO> caseResultVoToIDO(List<CaseResultVO> caseResultVOS);
}
