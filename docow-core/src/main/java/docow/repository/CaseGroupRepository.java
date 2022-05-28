package docow.repository;


import docow.struct.vo1.CaseGroupQueryVO;
import docow.struct.vo1.CaseGroupVO;
import docow.struct.vo1.PageResultVO;
import docow.jooq.tables.CaseGroup;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static docow.jooq.Tables.CASE_DETAIL;
import static docow.jooq.tables.CaseGroup.CASE_GROUP;


@Repository
public class CaseGroupRepository {
    private final DSLContext create;
    private final CaseGroup cg = CASE_GROUP;

    public CaseGroupRepository(DSLContext create) {
        this.create = create;
    }

    public PageResultVO<CaseGroupVO> search(CaseGroupQueryVO caseGroupQueryVO){
        List<Condition> condition= new ArrayList<>();
        if(caseGroupQueryVO.getDescription()!=null){
            condition.add(CASE_GROUP.DESCRIPTION.like(caseGroupQueryVO.getDescription()));
        }
        return new PageResultVO<>(create.selectFrom(cg).
                where(condition).
                offset(Math.max((caseGroupQueryVO.getPage() - 1) * caseGroupQueryVO.getLimit(), 0)).
                 fetchStream()
                .map(v -> v.into(CaseGroupVO.class))
                .collect(Collectors.toList()),
        create.selectCount().from(CASE_DETAIL).where(condition).fetchOne().value1()
        );
    }
}
