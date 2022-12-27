package vip.yingmen.model;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XiaoShiExcel {
	 private List<Map<String,ArrayList<Map<Object, String>>>> list ;
	 private  List<String> rowNameList;
	 public XiaoShiExcel(List<Map<String, ArrayList<Map<Object, String>>>> list, List<String> rowNameList) {
		super();
		this.list = list;
		this.rowNameList = rowNameList;
	 }
	 
	 public  ResponseEntity<byte[]>  createExcel(String fileName) throws IOException{
		if (list.isEmpty()) {
			return ExcelTemplate.getEmptyResponseEntity(fileName);
		}
		List<List<String>> head = Lists.newArrayList();
		List<List<String>> data = Lists.newArrayList();
		Map<String ,ArrayList<Map<Object, String>> > resMap  = list.get(0);
		ArrayList<Map<Object, String>> tongji = resMap.get("tongji");
		ArrayList<Map<Object, String>> zhandian = resMap.get("zhandian");
		if (zhandian.isEmpty()) {
			return ExcelTemplate.getEmptyResponseEntity(fileName);
		}
		head.add(Lists.newArrayList("时间"));
		for (int tongjiIndex = 0; tongjiIndex < tongji.size(); tongjiIndex++) {
			Map<Object, String> tongjiMap = tongji.get(tongjiIndex);
			Object rowValue = tongjiMap.get("dt");
			data.add(Lists.newArrayList(rowValue.toString()));
		}
		for (int zhandianIndex = 0; zhandianIndex < zhandian.size(); zhandianIndex++) {
			Map<Object, String> zhandianMap  =zhandian.get(zhandianIndex);
			String zhanMing = zhandianMap.get("STNM");
			if (StringUtils.isBlank(zhanMing)) {
				zhanMing = zhandianMap.get("stnm");
			}
			for (String rowName : rowNameList) {
				head.add(Lists.newArrayList(zhanMing,rowName));
				for (int tongjiIndex = 0; tongjiIndex < tongji.size(); tongjiIndex++) {
	        		Map<Object, String> tongjiMap = tongji.get(tongjiIndex);
	        		Object rowValue = tongjiMap.getOrDefault(zhanMing+rowName, "");
	        		List<String> rowList = data.get(tongjiIndex);
	        		rowList.add(rowValue.toString());
	        	}
			}
		}
		return ExcelTemplate.getCommonResponseEntity(fileName, head, data);
	}
	 
	 public  ResponseEntity<byte[]>  createExcelByShuiKuShuiQi(String fileName) throws IOException{
			if (list.isEmpty()) {
				return ExcelTemplate.getEmptyResponseEntity(fileName);
			}
			List<List<String>> head = Lists.newArrayList();
			List<List<String>> data = Lists.newArrayList();
			Map<String ,ArrayList<Map<Object, String>> > resMap  = list.get(0);
			ArrayList<Map<Object, String>> tongji = resMap.get("tongji");
			ArrayList<Map<Object, String>> zhandian = resMap.get("zhandian");
			if (zhandian.isEmpty()) {
				return ExcelTemplate.getEmptyResponseEntity(fileName);
			}
			head.add(Lists.newArrayList("站点","汛限水位","正常蓄水位","时间"));
			for (int tongjiIndex = 0; tongjiIndex < tongji.size(); tongjiIndex++) {
				Map<Object, String> tongjiMap = tongji.get(tongjiIndex);
				Object rowValue = tongjiMap.get("dt");
				data.add(Lists.newArrayList(rowValue.toString()));
			}
			for (int zhandianIndex = 0; zhandianIndex < zhandian.size(); zhandianIndex++) {
				Map<Object, String> zhandianMap  =zhandian.get(zhandianIndex);
				String zhanMing = zhandianMap.get("STNM");
				if (StringUtils.isBlank(zhanMing)) {
					zhanMing = zhandianMap.get("stnm");
				}
				Object FWL = zhandianMap.get("FWL");
        		Object FWL79 = zhandianMap.get("FWL79");
        		Object ZCWL = zhandianMap.get("ZCWL");
				for (String rowName : rowNameList) {
					head.add(Lists.newArrayList(zhanMing,"4-6月："+FWL+"  7-9月："+FWL79,ZCWL.toString(),rowName));
					for (int tongjiIndex = 0; tongjiIndex < tongji.size(); tongjiIndex++) {
		        		Map<Object, String> tongjiMap = tongji.get(tongjiIndex);
		        		Object rowValue = tongjiMap.getOrDefault(zhanMing+rowName, "");
		        		rowValue = getNewRowValueByShuiShi(rowValue,rowName);
		        		List<String> rowList = data.get(tongjiIndex);
		        		rowList.add(rowValue.toString());
		        	}
				}
			}
			return ExcelTemplate.getCommonResponseEntity(fileName, head, data);
		}
	 
	 
	  public static final String ShuiShi = "水势";
	private Object getNewRowValueByShuiShi(Object rowValue, String rowName) {
		if (Objects.equals(rowName, ShuiShi)) {
			String rowValueStr = rowValue.toString();
			if (StringUtils.isNotBlank(rowValueStr)) {
				BigDecimal shuiShi = new BigDecimal(rowValueStr);
				if (shuiShi.signum() == 0) {
					return "-";
				}
				if (shuiShi.signum() == 1) {
					return "↑";
				}
				if (shuiShi.signum() == -1) {
					return "↓";
				}
			}
		}
		return rowValue;
		
	}

}
