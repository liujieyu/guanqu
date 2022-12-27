package vip.yingmen.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import vip.yingmen.model.CommonFactory;
import vip.yingmen.model.ExcelSheetVo;
import vip.yingmen.model.ExcelTemplate;
import vip.yingmen.model.XiaoShiExcel;
import vip.yingmen.service.QuDaoShuiQingXiaoShiBiaoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class QuDaoShuiQingXiaoShiBiaoController {
    @Autowired
    private QuDaoShuiQingXiaoShiBiaoService xiaoShiBiaoService;
    //历史数据的渠道水情小时表查询
    @GetMapping(value = "/qudaoshuiqing/xiaoshibiao")
    public  List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                           @RequestParam(value="Time_max", required=false) String Time_max,
                                                                           @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                           @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                           @RequestParam(value="STYPE", required=false) String STYPE,
                                                                           @RequestParam(value="STNM", required=false) String STNM){
        return   xiaoShiBiaoService.findByXiaoShi(Time_min,Time_max,ADDVCD,Canal_Code,STYPE,STNM);
    }
	
	@Autowired private CommonFactory commonFactory;
    
    @GetMapping(value = "/qudaoshuiqing/xiaoshibiao/download-xlsx")
    public  ResponseEntity<byte[]>   findByXiaoShiExcel(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                           @RequestParam(value="Time_max", required=false) String Time_max,
                                                                           @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                           @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                           @RequestParam(value="STYPE", required=false) String STYPE,
                                                                           @RequestParam(value="STNM", required=false) String STNM) throws IOException{
    	List<Map<String,ArrayList<Map<Object, String>>>> list 
    		=   xiaoShiBiaoService.findByXiaoShi(Time_min,Time_max,ADDVCD,Canal_Code,STYPE,STNM);
    	XiaoShiExcel xiaoShiExcel = commonFactory.getXiaoShiExcel(list, rowNameList);
		return xiaoShiExcel.createExcel(fileName);
//    	List<ExcelSheetVo> excelSheetVolist = ExcelTemplate.getExcelSheetVolist(rowNameList,list);
//		return ExcelTemplate.getResponseEntityByExcelSheet(fileName , rowNameList, excelSheetVolist);
    }
    public static final String fileName = "渠道水情小时表.xlsx";
    public static List<String> rowNameList = Lists.newArrayList("平均水深","平均流量","小时累计水量");
  
}
