package billManagement.controller;

import billManagement.req.BillQueryReq;
import billManagement.resp.CommonResp;
import billManagement.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName BillController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/23 上午12:37
 * @Version 1.0
 **/
@RestController
@RequestMapping("/bill")
public class BillController {

    private static final Logger LOG= LoggerFactory.getLogger(BillController.class);

    @Resource
    private BillService billService;

    @GetMapping("/list")
    public CommonResp list(BillQueryReq req) {
        LOG.info("传入的查找参数为:{}",req);
        // billService.list(req);

        return new CommonResp();
    }

}
