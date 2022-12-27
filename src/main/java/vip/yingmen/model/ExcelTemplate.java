package vip.yingmen.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.google.common.collect.Lists;

public class ExcelTemplate<T> {
	private static final String EXCEL_TPL_PATH ="excelTpl/";
	public static <T> ExcelTemplate<T> getInstance(String templateResource,Function<Integer, List<T>> getExcelData) {
		ExcelTemplate<T> excelTemplate = new ExcelTemplate<T>(EXCEL_TPL_PATH+templateResource);
		excelTemplate.getExcelData = getExcelData;
		return excelTemplate;
	}
	private ExcelTemplate(String templateResource) {
		super();
		this.templateResource = templateResource;
	}
	private final String templateResource;
	private Function<Integer, List<T>> getExcelData;
	
	
	
	public  ResponseEntity<byte[]> getResponseEntity( String fileName , Map<String, Object> map) throws IOException{
		 ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
		 Resource resource = new ClassPathResource(templateResource);
		 ExcelWriter excelWriter = EasyExcel.write(outputStream).withTemplate(resource.getInputStream()).build();
		  WriteSheet writeSheet = EasyExcel.writerSheet().build();
		 Integer start = 1;
		 List<T> excelData = getExcelData.apply(start);
		 
		 while (!excelData.isEmpty()) {
			 excelWriter.fill(excelData, writeSheet);
			 start ++;
			 excelData = getExcelData.apply(start);
		 }
		 if (map != null && !map.isEmpty()) {
			  excelWriter.fill(map, writeSheet);
		 }
		 excelWriter.finish();
		 byte[] input = outputStream.toByteArray();
		 HttpHeaders headers = new HttpHeaders();  
		 String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	      
		 headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",downloadFileName));  
		 return ResponseEntity.ok()
				.headers(headers)
				.contentType(MediaType.parseMediaType("application/force-download"))  
                .body(input);
	}
	
	
	
	public static ResponseEntity<byte[]> getEmptyResponseEntity( String fileName) throws IOException{
		 ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
		 List<List<String>> headList = Lists.newArrayList();
		 headList.add(Lists.newArrayList("时间"));
		 EasyExcel.write(outputStream).head(headList).sheet("数据").doWrite(Lists.newArrayList());
		 byte[] input = outputStream.toByteArray();
		 HttpHeaders headers = new HttpHeaders();  
		 String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	      
		 headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",downloadFileName));  
		 return ResponseEntity.ok()
				.headers(headers)
				.contentType(MediaType.parseMediaType("application/force-download"))  
              .body(input);
	}
	

	public static ResponseEntity<byte[]> getCommonResponseEntity( String fileName
			, List<List<String>> head,List<List<String>> data) throws IOException{
		
		
		 ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
		 EasyExcel.write(outputStream)
		 .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
		 .head(head)
		 .sheet("数据")
		 .doWrite(data);
		 byte[] input = outputStream.toByteArray();
		 HttpHeaders headers = new HttpHeaders();  
		 String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	      
		 headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",downloadFileName));  
		 return ResponseEntity.ok()
				.headers(headers)
				.contentType(MediaType.parseMediaType("application/force-download"))  
               .body(input);
	}
	
	
	public static  ResponseEntity<byte[]> getResponseEntityByHeadData( String fileName 
			, List<String> head
			,List<ExcelSheetVo> excelSheetVolist) throws IOException{
		
		 ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
		 List<List<String>> headList = Lists.newArrayList();
			for (String headValue : head) {
				headList.add(Lists.newArrayList(headValue));
			}
		ExcelWriter excelWriter = EasyExcel.write(outputStream).build();
		 for (int i = 0; i < excelSheetVolist.size(); i++) {
			 ExcelSheetVo excelSheetVo = excelSheetVolist.get(i);
				List<List<String>> sheetheadList = Lists.newArrayList(headList);
//				for (String data : excelSheetVo.headDatalist) {
//					sheetheadList.add(Lists.newArrayList(data));
//				}
			
			 WriteSheet writeSheet = EasyExcel.writerSheet(i,excelSheetVo.sheetName)
					 .needHead(Boolean.TRUE)
					 .head(sheetheadList)
					 .build();
			 if (excelSheetVo.rowlist != null ) {
				 excelWriter.write(excelSheetVo.rowlist, writeSheet);
			}
			
		 }
		 excelWriter.finish();
		 
		 byte[] input = outputStream.toByteArray();
		 HttpHeaders headers = new HttpHeaders();  
		 String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	      
		 headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",downloadFileName));  
		 return ResponseEntity.ok()
				.headers(headers)
				.contentType(MediaType.parseMediaType("application/force-download"))  
             .body(input);
	}
	
	
	
	
	public static  ResponseEntity<byte[]> getResponseEntityByExcelSheet( String fileName 
			, List<String> head
			,List<ExcelSheetVo> excelSheetVolist) throws IOException{
		
		 ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
		List<List<String>> headList = Lists.newArrayList();
		for (String headValue : head) {
			headList.add(Lists.newArrayList(headValue));
		}
		ExcelWriter excelWriter = EasyExcel.write(outputStream).build();
		 WriteSheet writeSheet = EasyExcel.writerSheet("数据").needHead(Boolean.TRUE).build();
		 for (int i = 0; i < excelSheetVolist.size(); i++) {
			 ExcelSheetVo excelSheetVo = excelSheetVolist.get(i);
			
			 if (excelSheetVo.rowlist != null ) {
				 excelWriter.write(excelSheetVo.rowlist, writeSheet);
			}
			
		 }
		 excelWriter.finish();
		 
		 byte[] input = outputStream.toByteArray();
		 HttpHeaders headers = new HttpHeaders();  
		 String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	      
		 headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",downloadFileName));  
		 return ResponseEntity.ok()
				.headers(headers)
				.contentType(MediaType.parseMediaType("application/force-download"))  
              .body(input);
	}

	  public static List<ExcelSheetVo> getExcelSheetVolist(  List<String> rowNameList
			  , List<Map<String,ArrayList<Map<Object, String>>>> list){
		  return getExcelSheetVolist(rowNameList, list, null);
	  }
	  public static List<ExcelSheetVo> getExcelSheetVolist(  List<String> rowNameList
			  , List<Map<String,ArrayList<Map<Object, String>>>> list
			  ,Function<Map<Object, String>, List<String>> getHeadDatalistFunction){
	    	List<ExcelSheetVo> excelSheetVolist = Lists.newArrayList();
	    	if (list.isEmpty()) {
	    		return excelSheetVolist;
			}
	    	Map<String ,ArrayList<Map<Object, String>> > resMap  = list.get(0);
	    	ArrayList<Map<Object, String>> tongji = resMap.get("tongji");
	    	ArrayList<Map<Object, String>> zhandian = resMap.get("zhandian");
	    	for (Map<Object, String> zhandianMap : zhandian) {
	    		ExcelSheetVo excelSheetVo = new ExcelSheetVo();
	    		String zhanMing = zhandianMap.get("STNM");
	    		if (StringUtils.isBlank(zhanMing)) {
	    			zhanMing = zhandianMap.get("stnm");
				}
	    		if (getHeadDatalistFunction != null) {
	    			excelSheetVo.headDatalist = getHeadDatalistFunction.apply(zhandianMap);
				}
	    		excelSheetVo.sheetName = zhanMing;
	    		excelSheetVo.rowlist = Lists.newArrayList();
	    		
	    		for (Map<Object, String> tongjiMap : tongji) {
	    			List<String> row = Lists.newArrayList();
	    			row.add(tongjiMap.get("dt"));
	    			for (int rowIndex = 1; rowIndex < rowNameList.size(); rowIndex++) {
	    				String rowName = rowNameList.get(rowIndex);
	    				Object rowValue = tongjiMap.get(zhanMing+rowName);
	    				if (rowValue != null) {
	    					row.add( rowValue.toString() );
						}else {
							row.add( "" );
						}
	    				
					}
					excelSheetVo.rowlist.add(row);
				}
	    		excelSheetVolist.add(excelSheetVo);
			}
	    	return excelSheetVolist;
	    }
}
