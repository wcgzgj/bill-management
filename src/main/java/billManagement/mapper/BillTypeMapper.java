package billManagement.mapper;

import billManagement.pojo.BillType;
import billManagement.pojo.BillTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillTypeMapper {
    long countByExample(BillTypeExample example);

    int deleteByExample(BillTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillType record);

    int insertSelective(BillType record);

    List<BillType> selectByExample(BillTypeExample example);

    BillType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillType record, @Param("example") BillTypeExample example);

    int updateByExample(@Param("record") BillType record, @Param("example") BillTypeExample example);

    int updateByPrimaryKeySelective(BillType record);

    int updateByPrimaryKey(BillType record);
}