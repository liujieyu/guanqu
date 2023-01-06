package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WrpDfrSrhrdsmp;
import vip.yingmen.pojo.WrpSpgPztb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgPztbMapper extends BaseMapper<WrpSpgPztb> {
    //根据ID获取渗流压力测点信息
    public WrpSpgPztb selectSlylInfoById(@Param("ID") Integer ID);
    //根据ID获取表面位移测点信息
    public WrpDfrSrhrdsmp selectSpwyInfoById(@Param("ID") Integer ID);
}
