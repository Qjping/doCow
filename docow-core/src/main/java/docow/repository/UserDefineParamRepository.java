package docow.repository;

import docow.struct.vo1.CaseQueryVO;
import docow.struct.vo1.UserDefineParamVO;
import docow.jooq.tables.UserDefineParam;
import docow.jooq.tables.records.UserDefineParamRecord;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static docow.jooq.Tables.USER_DEFINE_PARAM;


@Repository
public class UserDefineParamRepository {
    private final DSLContext create;
    private final UserDefineParam udp = UserDefineParam.USER_DEFINE_PARAM;

    public UserDefineParamRepository(DSLContext create) {
        this.create = create;
    }

    public List<UserDefineParamVO> seach(CaseQueryVO caseQueryVO) {
        List<Condition> condition = new ArrayList<>();


        if (caseQueryVO.getGroupId() != null) {
            condition.add(USER_DEFINE_PARAM.CASE_GROUP_ID.eq(caseQueryVO.getGroupId()));
        }

        return create.selectFrom(USER_DEFINE_PARAM)
                .where(condition)
                .fetchStream()
                .map(v -> v.into(UserDefineParamVO.class))
                .collect(Collectors.toList());
    }

    public void  save(List<UserDefineParamVO> userDefineParamVOS){
        List<UserDefineParamRecord> recordList = new ArrayList<>();
        userDefineParamVOS.forEach(userDefineParamVO -> {
                    recordList.add(create.newRecord(udp,userDefineParamVO));
                }
        );

        create.batchInsert(recordList).execute();

    }
}
