package vip.yingmen.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import vip.yingmen.model.CommonFactory;
import vip.yingmen.model.XiaoShiExcel;
import vip.yingmen.service.ZhaFaShuiQingXiaoShiBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaShuiQingXiaoShiBiaoController {
    @Autowired
    private ZhaFaShuiQingXiaoShiBiaoService xiaoShiBiaoService;
    //闸阀水情历史数据的小时表查询
    @GetMapping(value = "/zhafashuiqing/lishi_xiaoshibiao")
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                          @RequestParam(value="Time_max", required=false) String Time_max,
                                                                          @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                          @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                          @RequestParam(value="CTYPE", required=false) String CTYPE,
                                                                          @RequestParam(value="STNM", required=false) String STNM){
        return   xiaoShiBiaoService.findByXiaoShi(Time_min,Time_max,ADDVCD,Canal_Code,CTYPE,STNM);
    }
    @Autowired private CommonFactory commonFactory;
    @GetMapping(value = "/zhafashuiqing/lishi_xiaoshibiao/download-xlsx")
    public  ResponseEntity<byte[]> findByXiaoShiExcel(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                          @RequestParam(value="Time_max", required=false) String Time_max,
                                                                          @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                          @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                          @RequestParam(value="CTYPE", required=false) String CTYPE,
                                                                          @RequestParam(value="STNM", required=false) String STNM) throws IOException{
    	 List<Map<String,ArrayList<Map<Object, String>>>> list
    	 	=   xiaoShiBiaoService.findByXiaoShi(Time_min,Time_max,ADDVCD,Canal_Code,CTYPE,STNM);
    		XiaoShiExcel xiaoShiExcel = commonFactory.getXiaoShiExcel(list, rowNameList);
    		return xiaoShiExcel.createExcel(fileName);
//     	List<ExcelSheetVo> excelSheetVolist = ExcelTemplate.getExcelSheetVolist(rowNameList,list);
// 		return ExcelTemplate.getResponseEntityByExcelSheet(fileName , rowNameList, excelSheetVolist);
    }
    public static final String fileName = "闸阀水情小时表.xlsx";
    public static List<String> rowNameList = Lists.newArrayList("闸阀上水位","闸阀下水位","平均流量","小时累计水量");
}
