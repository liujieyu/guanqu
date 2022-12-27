package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_PPTN_R;

import java.util.List;

public interface ST_PPTN_RMapper {
    public List<ST_PPTN_R> findBySingleLiShi(@Param("STCD") String STCD);
}
