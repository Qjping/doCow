package docow.Handler;

import docow.Handler.base.AbstractProcessor;

public class AssertHandler<T> extends AbstractProcessor<T > {
    @Override
    protected void doExecute(T context) {
//        doAssert((CaseResultVO) context);

    }

//    public CaseModel doAssert(CaseResultVO caseResultVO)  {
//        CaseDetailVO caseDetailVO = null;
//
////        JSONObject expecteds= jsonUtil.toEntity(caseDetailVO.getAssertions(),JSONObject.class);
//        String resultResponce = caseResultVO.getResponseResult();
//
//        if(caseResultVO.getHttpStatusCode()!=200
//                || StringUtils.isNullOrEmpty( resultResponce)
//                ||StringUtils.isNullOrEmpty(caseDetailVO.getAssertions())) {
//            //todo 处理返回结果为空
//            return  null;
//        }
//        JSONObject expecteds=new JSONObject((caseDetailVO.getAssertions()));
//
//        expecteds.keys().forEachRemaining(actualVaule->{
//            expecteds.getString(actualVaule);
//            if(JSONPath.extract(resultResponce,expecteds.getString(actualVaule))!=null) {
//                String expectedValue = JSONPath.extract(resultResponce, expecteds.getString(actualVaule)).toString();
//                String regex = "\\$\\{(.*?)\\}";
//                Pattern p = Pattern.compile(regex);
//                Matcher m = p.matcher(expectedValue);
//                if (m.find()) {
//                    actualVaule = actualVaule.replace("${", "").replace("}", "");
//                    if (!userDefineParamMap.get(actualVaule).equals(expectedValue)) {
//                        log.info("assert匹配失败用例id:" + caseDetailVO.toString() + ",期望的值：" + expectedValue);
//                    }
//                    //               Assert.doAssert(CaseConfig.globalParam.get(expected), expecteds);
//                } else {
//                    if (!actualVaule.equals(expectedValue)) {
//                        log.info("assert匹配失败用例id:" + caseDetailVO.toString() + ",期望的值：" + expectedValue);
//                    }
//                    //                Assert.doAssert(expecteds.getString(path), CaseConfig.globalParam.get(expected));
//                }
//            }else {
//                log.error("断言值未找到:"+caseDetailVO.toString());
//            }
//        });
//        return this;
//    }
}
