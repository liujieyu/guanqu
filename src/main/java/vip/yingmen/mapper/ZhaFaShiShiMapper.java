package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface ZhaFaShiShiMapper {
    public void updateByZhaFa(@RequestParam("searchMap")Map searchMap);
}
