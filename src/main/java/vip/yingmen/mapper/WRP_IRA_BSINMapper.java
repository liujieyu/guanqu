package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_IRA_BSIN;

import java.util.List;

public interface WRP_IRA_BSINMapper {
        public List<WRP_IRA_BSIN> findAll();
        //基础数据的灌区基本信息查询
        public List<WRP_IRA_BSIN> findByIARHWPRTPAndIRASC(@Param("IARHWPRTP") String IARHWPRTP,@Param("IRASC") String IRASC);
}
