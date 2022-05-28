package docow.api;

import docow.struct.ido.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import docow.service.CaseDetailService;
import docow.service.CaseGroupService;


@RestController
@RequestMapping("/case-group")
public class CaseGroupController {
    @Autowired
    private  CaseGroupService caseGroupService;
    @Autowired
    private  CaseDetailService caseDetailService;

//    public CaseGroupController(CaseGroupService caseGroupService, CaseDetailService caseDetailService) {
//        this.caseGroupService = caseGroupService;
//        this.caseDetailService = caseDetailService;
//    }

//    private final WarehouseGoodsSkuContext warehouseGoodsSkuContext;
//
//    public WarehouseGoodsSkuController(WarehouseGoodsSkuContext warehouseGoodsSkuContext) {
//        this.warehouseGoodsSkuContext = warehouseGoodsSkuContext;
//    }
//
//
//    @GetMapping("search")
//    public ApiResultIDO<PageResultIDO<CaseDetailVO>> search(@Valid CaseQueryIDO queryIDO,
//                                                            BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            FieldError fieldError = (FieldError) bindingResult.getAllErrors().get(0);
//            return new ApiResultIDO(ExceptionCodeEnum.ARGUMENT_NOT_VALID_EXCEPTION.getCode(),
//                    fieldError.getDefaultMessage(), null);
//        }
//        PageResultIDO<CaseDetailVO> pageResultIDO = warehouseGoodsSkuContext.search(queryIDO.getWarehouseId(), queryIDO);
//        return ApiResultIDO.success(pageResultIDO);
//    }

    @GetMapping("search")
    public ApiResultIDO<PageResultIDO<CaseGroupIDO>> search(CaseGroupQueryIDO caseQueryIDO){
        return ApiResultIDO.success(caseGroupService.search(caseQueryIDO));
    }

    @PostMapping("execute")
    public ApiResultIDO<CaseReportIDO> execute(CaseQueryIDO caseQueryIDO){
        return ApiResultIDO.success(caseDetailService.execute(caseQueryIDO));
    }

}
