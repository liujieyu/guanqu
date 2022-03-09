package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ZhaFaShiShiMapper;
import vip.yingmen.service.ZhaFaShiShiService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Service
public class ZhaFaShiShiServiceImpl implements ZhaFaShiShiService {
    @Autowired
    private ZhaFaShiShiMapper zhaFaShiShiMapper;
    @Override
    public void updateByZhaFa(Map searchMap) {
        if(searchMap.get("TM")==null){
            DateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            Date date1 = new Date();
            searchMap.put("TM",df.format(date1));
        }
        zhaFaShiShiMapper.updateByZhaFa(searchMap);
    }
}
