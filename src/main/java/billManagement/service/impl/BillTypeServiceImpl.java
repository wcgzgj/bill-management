package billManagement.service.impl;

import billManagement.mapper.BillTypeMapper;
import billManagement.pojo.BillType;
import billManagement.service.BillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BillTypeServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/23 上午12:36
 * @Version 1.0
 **/
@Service
public class BillTypeServiceImpl implements BillTypeService {

    @Resource
    private BillTypeMapper billTypeMapper;

    /**
     * 获取所有账单类型
     *
     * @return
     */
    @Override
    public List<BillType> getAll() {
        return billTypeMapper.selectByExample(null);
    }
}
