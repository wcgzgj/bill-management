package billManagement.service;

import billManagement.pojo.BillType;

import java.util.List;

public interface BillTypeService {

    /**
     * 获取所有账单类型
     * @return
     */
    List<BillType> getAll();



}
