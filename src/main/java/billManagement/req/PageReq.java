package billManagement.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @ClassName PageReq
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/23 上午12:11
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PageReq {
    private int pageNum;

    private int pageSize;
}
