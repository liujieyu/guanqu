package vip.yingmen.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;


@Service
public class CommonFactory {
	@Autowired private ApplicationContext applicationContext;
	
	public 	XiaoShiExcel getXiaoShiExcel(List<Map<String,ArrayList<Map<Object, String>>>> list
			,  List<String> rowNameList ) {
		return applicationContext.getBean(XiaoShiExcel.class,list,rowNameList);
	}
  
}
