package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.StRsrBsin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.yingmen.pojo.StRsrHych;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  测站水库站基本信息和防洪信息  Mapper 接口
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
public interface StRsrBsinMapper extends BaseMapper<StRsrBsin> {
    //水库站基本信息查询
    List<StRsrBsin> selectRsrBsinInfoByCon(@RequestParam("searchMap") Map searchMap);
    //测站防洪基本信息查询
    List<StRsrHych> selectRsrHychByCon(@RequestParam("searchMap") Map searchMap);
}
