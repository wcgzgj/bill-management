package billManagement.service;

import billManagement.req.BillQueryReq;
import billManagement.resp.PageResp;

public interface BillService {

    /**
     * 获取账单的信息
     * 查询条件包括分页参数和模糊查询
     * @param req
     * @return
     */
    PageResp list(BillQueryReq req);
}
