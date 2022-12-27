package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.google.common.collect.Lists;

import vip.yingmen.model.CommonFactory;
import vip.yingmen.model.ExcelSheetVo;
import vip.yingmen.model.ExcelTemplate;
import vip.yingmen.model.XiaoShiExcel;
import vip.yingmen.service.QuDaoShuiQingXiaoShiBiaoService;
import vip.yingmen.service.ShuiKuShuiQingXiaoShiBiaoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ShuiKuShuiQingXiaoShiBiaoController {
    @Autowired
    private ShuiKuShuiQingXiaoShiBiaoService xiaoShiBiaoService;
    //历史数据的水库水情小时表查询
    @GetMapping(value = "/shuikushuiqing/lishi_xiaoshibiao")
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                          @RequestParam(value="Time_max", required=false) String Time_max,
                                                                          @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                          @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                          @RequestParam(value="LEVEL", required=false) String LEVEL,
                                                                          @RequestParam(value="STGR", required=false) String STGR,
                                                                          @RequestParam(value="STNM", required=false) String STNM){
        return   xiaoShiBiaoService.findByXiaoShi(Time_min,Time_max,ADDVCD,Canal_Code,LEVEL,STGR,STNM);
    }
    @Autowired private CommonFactory commonFactory;
    @GetMapping(value = "/shuikushuiqing/lishi_xiaoshibiao/download-xlsx")
    public   ResponseEntity<byte[]>  findByXiaoShiExcel(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                          @RequestParam(value="Time_max", required=false) String Time_max,
                                                                          @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                          @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                          @RequestParam(value="LEVEL", required=false) String LEVEL,
                                                                          @RequestParam(value="STGR", required=false) String STGR,
                                                                          @RequestParam(value="STNM", required=false) String STNM) throws IOException{
    	 List<Map<String,ArrayList<Map<Object, String>>>> list 
    	 =   xiaoShiBiaoService.findByXiaoShi(Time_min,Time_max,ADDVCD,Canal_Code,LEVEL,STGR,STNM);
    		XiaoShiExcel xiaoShiExcel = commonFactory.getXiaoShiExcel(list, rowNameList);
    		return xiaoShiExcel.createExcelByShuiKuShuiQi(fileName);
//    		String fileName = "水库水情小时表.xlsx";
//        	List<ExcelSheetVo> excelSheetVolist = ExcelTemplate.getExcelSheetVolist(rowNameList,list,var->{
//        		Object FWL = var.get("FWL");
//        		Object FWL79 = var.get("FWL79");
//        		Object ZCWL = var.get("ZCWL");
//        		List<String> headDataList = Lists.newArrayList("汛限水位"
//        				,"4-6月："+FWL
//        				,"4-6月："+FWL79
//        				,"正常蓄水位"
//        				,ZCWL.toString());
//        		return headDataList;
//        	});
//    		return ExcelTemplate.getResponseEntityByHeadData(fileName , rowNameList, excelSheetVolist);
    }
    public static final String fileName = "水库水情小时表.xlsx";
    public static List<String> rowNameList = Lists.newArrayList("平均水位","水势","平均入库流量","平均入库流量","小时蓄水量");
}
