package docow.converter;


import docow.struct.ido.CaseGroupIDO;
import docow.struct.ido.CaseGroupQueryIDO;
import docow.struct.vo1.CaseGroupQueryVO;
import docow.struct.vo1.CaseGroupVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper(componentModel = "spring")
public interface CaseGroupConverter {
    List<CaseGroupIDO> VoToListIDOList(List<CaseGroupVO> caseGroupVOList);
    CaseGroupQueryVO IdoToQueryVO(CaseGroupQueryIDO queryIDO);
}
