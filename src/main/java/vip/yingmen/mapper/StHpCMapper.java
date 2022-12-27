package vip.yingmen.mapper;

import vip.yingmen.entity.StHpC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sa
 * @since 2019-09-17
 */
@Component
public interface StHpCMapper extends BaseMapper<StHpC> {
    List<StHpC> selectByPrimaryKey(@Param("id") int id);
}
