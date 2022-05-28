package docow.service;


import docow.converter.CaseGroupConverter;
import docow.repository.CaseGroupRepository;
import docow.struct.ido.CaseGroupIDO;
import docow.struct.ido.CaseGroupQueryIDO;
import docow.struct.ido.PageResultIDO;
import docow.struct.vo1.CaseGroupQueryVO;
import docow.struct.vo1.CaseGroupVO;
import docow.struct.vo1.PageResultVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseGroupService {
    private final CaseGroupRepository caseGroupRepository;
    private final CaseGroupConverter caseGroupConverter;

    public CaseGroupService(CaseGroupRepository caseGroupRepository, CaseGroupConverter caseGroupConverter) {
        this.caseGroupRepository = caseGroupRepository;
        this.caseGroupConverter = caseGroupConverter;
    }

    public PageResultIDO<CaseGroupIDO> search(CaseGroupQueryIDO caseGroupQueryIDO){
        CaseGroupQueryVO caseGroupVO = caseGroupConverter.IdoToQueryVO(caseGroupQueryIDO);
      PageResultVO<CaseGroupVO> caseGroupVOPageResultVO = caseGroupRepository.search(caseGroupVO);
      List<CaseGroupVO> caseGroupIDOList= caseGroupVOPageResultVO.getList();
      return new PageResultIDO<>(caseGroupConverter.VoToListIDOList(caseGroupIDOList),caseGroupVOPageResultVO.getCount());
    }
}
