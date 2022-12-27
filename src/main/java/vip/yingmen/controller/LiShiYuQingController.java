package vip.yingmen.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import vip.yingmen.model.ExcelTemplate;
import vip.yingmen.pojo.LSYQShuiWeiTJ;
import vip.yingmen.pojo.LSYQZGSWLieBiao;
import vip.yingmen.pojo.LiSHiYuQingXiaoShiLieBiao;
import vip.yingmen.pojo.LiSHiYuQingXunLieBiao;
import vip.yingmen.pojo.LiShiYuQingTongJi;
import vip.yingmen.pojo.LiShiYuQingXiaoShiZhanShuTongJi;
import vip.yingmen.service.LiShiYuQingService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class LiShiYuQingController {
    @Autowired
    private LiShiYuQingService liShiYuQingService;

    //历史数据的小时表统计
    @GetMapping(value = "/yuqing/lishi_xiaoshitongji")
    public PageInfo<LiShiYuQingTongJi> findByXiaoShiTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                           @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                           @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                           @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                           @RequestParam(value = "STGR", required = false) String STGR,
                                                           @RequestParam(value = "STNM", required = false) String STNM,
                                                           @RequestParam(value = "P", required = false) String P,
                                                           @RequestParam(value = "Time_min", required = false) String Time_min,
                                                           @RequestParam(value = "Time_max", required = false) String Time_max) {
        return liShiYuQingService.findByXiaoShiTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max);
    }

    //历史数据的小时表雨量特征统计
    @GetMapping(value = "/yuqing/lishi_xiaoshizhanshutongji")
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByXiaoShiZhanShuTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                                @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                                @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                                @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                                @RequestParam(value = "STGR", required = false) String STGR,
                                                                                @RequestParam(value = "STNM", required = false) String STNM,
                                                                                @RequestParam(value = "P", required = false) String P,
                                                                                @RequestParam(value = "Time_min", required = false) String Time_min,
                                                                                @RequestParam(value = "Time_max", required = false) String Time_max) {
        return liShiYuQingService.findByXiaoShiZhanShuTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max);
    }

    //历史数据的小时表雨情列表查询
    @GetMapping(value = "/yuqing/lishi_xiaoshiliebiao")
    public List<LiSHiYuQingXiaoShiLieBiao> findByXiaoShiLieBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                @RequestParam(value = "STGR", required = false) String STGR,
                                                                @RequestParam(value = "STNM", required = false) String STNM,
                                                                @RequestParam(value = "P", required = false) String P,
                                                                @RequestParam(value = "Time_min", required = false) String Time_min,
                                                                @RequestParam(value = "Time_max", required = false) String Time_max,
                                                                @RequestParam(value = "_orderby", required = false)String _orderby) {
        return liShiYuQingService.findByXiaoShiLieBiao(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max,_orderby);
    }

    //历史数据的渠道水情小时表特征查询
    @GetMapping(value = "/yuqing/lishi_xiaoshitezheng")
    public  List<Map<String, ArrayList<Map<Object, String>>>> findByXiaoShi(@RequestParam(value="Time_min", required=false) String Time_min,
                                                                            @RequestParam(value="Time_max", required=false) String Time_max,
                                                                            @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                            @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                            @RequestParam(value="STGR", required=false) String STGR,
                                                                            @RequestParam(value="STNM", required=false) String STNM){
        return   liShiYuQingService.findByXiaoShiTeZheng(Time_min,Time_max,ADDVCD,Canal_Code,STGR,STNM);
    }

    //历史数据的日表统计
    @GetMapping(value = "/yuqing/lishi_ritongji")
    public PageInfo<LiShiYuQingTongJi> findByRiTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                      @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                      @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                      @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                      @RequestParam(value = "STGR", required = false) String STGR,
                                                      @RequestParam(value = "STNM", required = false) String STNM,
                                                      @RequestParam(value = "P", required = false) String P,
                                                      @RequestParam(value = "TM", required = false) String TM) {
        return liShiYuQingService.findByRiTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, TM);
    }

    //历史数据的日表雨量特征统计
    @GetMapping(value = "/yuqing/lishi_rizhanshutongji")
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByRiZhanShuTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                           @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                           @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                           @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                           @RequestParam(value = "STGR", required = false) String STGR,
                                                                           @RequestParam(value = "STNM", required = false) String STNM,
                                                                           @RequestParam(value = "P", required = false) String P,
                                                                           @RequestParam(value = "TM", required = false) String TM) {
        return liShiYuQingService.findByRiZhanShuTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, TM);
    }

    //历史数据的日表雨情列表查询
    @GetMapping(value = "/yuqing/lishi_riliebiao")
    public List<Map> findByRiLieBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                     @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                     @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                     @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                     @RequestParam(value = "STGR", required = false) String STGR,
                                     @RequestParam(value = "STNM", required = false) String STNM,
                                     @RequestParam(value = "P", required = false) String P,
                                     @RequestParam(value = "Time_min", required = false) String Time_min,
                                     @RequestParam(value = "Time_max", required = false) String Time_max,
                                     @RequestParam(value = "TM", required = false)String TM,
                                     @RequestParam(value = "_orderby", required = false,defaultValue = "wzpx desc")String _orderby) {
        return liShiYuQingService.findByRiLieBiao(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max,TM,_orderby);
    }

    
    @SuppressWarnings({ "unchecked", "rawtypes" })
//	@GetMapping("/yuqing/lishi_riliebiao/download-xlsx")
//	public ResponseEntity<byte[]>  findByRiLieBiaoExcel(
//            @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
//            @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
//            @RequestParam(value = "STGR", required = false) String STGR,
//            @RequestParam(value = "STNM", required = false) String STNM,
//            @RequestParam(value = "P", required = false) String P,
//            @RequestParam(value = "Time_min", required = false) String Time_min,
//            @RequestParam(value = "Time_max", required = false) String Time_max,
//            @RequestParam(value = "TM", required = false)String TM,
//            @RequestParam(value = "_orderby", required = false,defaultValue = "wzpx desc")String _orderby ) throws IOException {
//		String templateResource ="yuqing_lishi_riliebiao-tpl.xlsx";
//    	ExcelTemplate<Map<String,Object>> excelTemplate = ExcelTemplate.getInstance(templateResource,var->{
//    		List<Map> maplist = this.findByRiLieBiao(var, 500, ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max, TM, _orderby);
//    		if (var == 1 && maplist.isEmpty() ) {
//				return Lists.newArrayList( Maps.newHashMap());
//			}
//			return maplist
//					.stream().map(bean->{
//				Map<String,Object> map = Maps.newHashMap(bean);
//				return map;
//			}).collect(Collectors.toList());
//		});
//    	String fileName ="历史数据的日表雨情.xlsx";
//    	Map<String, Object> map = Maps.newHashMap();
//    	map.put("tm", TM);
//    	return excelTemplate.getResponseEntity(fileName,map);
//	}
    

    //历史数据的旬表统计
    @GetMapping(value = "/yuqing/lishi_xuntongji")
    public PageInfo<LiShiYuQingTongJi> findByXunTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                       @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                       @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                       @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                       @RequestParam(value = "STGR", required = false) String STGR,
                                                       @RequestParam(value = "STNM", required = false) String STNM,
                                                       @RequestParam(value = "P", required = false) String P,
                                                       @RequestParam(value = "TM", required = false) String TM) {
        return liShiYuQingService.findByXunTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, TM);
    }

    //历史数据的旬表雨量特征统计
    @GetMapping(value = "/yuqing/lishi_xunzhanshutongji")
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByXunZhanShuTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                            @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                            @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                            @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                            @RequestParam(value = "STGR", required = false) String STGR,
                                                                            @RequestParam(value = "STNM", required = false) String STNM,
                                                                            @RequestParam(value = "P", required = false) String P,
                                                                            @RequestParam(value = "YR", required = false) String YR,
                                                                            @RequestParam(value = "MON", required = false) String MON) {
        return liShiYuQingService.findByXunZhanShuTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR,MON);
    }

    //历史数据的旬表雨情列表查询
    @GetMapping(value = "/yuqing/lishi_xunliebiao")
    public PageInfo<LiSHiYuQingXunLieBiao> findByXunLieBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                            @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                            @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                            @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                            @RequestParam(value = "STGR", required = false) String STGR,
                                                            @RequestParam(value = "STNM", required = false) String STNM,
                                                            @RequestParam(value = "P", required = false) String P,
                                                            @RequestParam(value = "TM", required = false)String TM,
                                                            @RequestParam(value = "_orderby", required = false,defaultValue = "wzpx desc")String _orderby,
                                                            @RequestParam(value = "YR", required = false) String YR,
                                                            @RequestParam(value = "MON", required = false) String MON) {
        return liShiYuQingService.findByXunLieBiao(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P,TM,_orderby,YR,MON);
    }

    //历史数据的月表统计
    @GetMapping(value = "/yuqing/lishi_yuetongji")
    public PageInfo<LiShiYuQingTongJi> findByYueTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                       @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                       @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                       @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                       @RequestParam(value = "STGR", required = false) String STGR,
                                                       @RequestParam(value = "STNM", required = false) String STNM,
                                                       @RequestParam(value = "P", required = false) String P,
                                                       @RequestParam(value = "YR", required = false) String YR,
                                                       @RequestParam(value = "MON", required = false) String MON) {
        return liShiYuQingService.findByYueTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR,MON);
    }

    //历史数据的月表雨量特征统计
    @GetMapping(value = "/yuqing/lishi_yuezhanshutongji")
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByYueZhanShuTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                            @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                            @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                            @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                            @RequestParam(value = "STGR", required = false) String STGR,
                                                                            @RequestParam(value = "STNM", required = false) String STNM,
                                                                            @RequestParam(value = "P", required = false) String P,
                                                                            @RequestParam(value = "YR", required = false) String YR,
                                                                            @RequestParam(value = "MON", required = false) String MON) {
        return liShiYuQingService.findByYueZhanShuTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR,MON);
    }


    //历史数据的月表雨情列表查询
    @GetMapping(value = "/yuqing/lishi_yueliebiao")
    public List<Map> findByYueLieBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                      @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                      @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                      @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                      @RequestParam(value = "STGR", required = false) String STGR,
                                      @RequestParam(value = "STNM", required = false) String STNM,
                                      @RequestParam(value = "P", required = false) String P,
                                      @RequestParam(value = "YR", required = false) String YR,
                                      @RequestParam(value = "MON", required = false) String MON,
                                      @RequestParam(value = "TM", required = false)String TM,
                                      @RequestParam(value = "_orderby", required = false,defaultValue = "wzpx desc")String _orderby) {
        return liShiYuQingService.findByYueLieBiao(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR, MON,TM,_orderby);
    }


    //历史数据的年表统计
    @GetMapping(value = "/yuqing/lishi_niantongji")
    public PageInfo<LiShiYuQingTongJi> findByNianTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                        @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                        @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                        @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                        @RequestParam(value = "STGR", required = false) String STGR,
                                                        @RequestParam(value = "STNM", required = false) String STNM,
                                                        @RequestParam(value = "P", required = false) String P,
                                                        @RequestParam(value = "YR", required = false) String YR) {
        return liShiYuQingService.findByNianTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR);
    }

    //历史数据的年表雨量特征统计
    @GetMapping(value = "/yuqing/lishi_nianzhanshutongji")
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByNianZhanShuTongJi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                             @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                             @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                             @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                             @RequestParam(value = "STGR", required = false) String STGR,
                                                                             @RequestParam(value = "STNM", required = false) String STNM,
                                                                             @RequestParam(value = "P", required = false) String P,
                                                                             @RequestParam(value = "YR", required = false) String YR) {
        return liShiYuQingService.findByNianZhanShuTongJi(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR);
    }


    //历史数据的年表雨情列表查询
    @GetMapping(value = "/yuqing/lishi_nianliebiao")
    public List<Map> findByNianLieBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                       @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                       @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                       @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                       @RequestParam(value = "STGR", required = false) String STGR,
                                       @RequestParam(value = "STNM", required = false) String STNM,
                                       @RequestParam(value = "P", required = false) String P,
                                       @RequestParam(value = "YR", required = false) String YR,
                                       @RequestParam(value = "_orderby", required = false,defaultValue = "wzpx desc")String _orderby) {
        return liShiYuQingService.findByNianLieBiao(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, P, YR,_orderby);
    }

    //历史数据的年表雨量最高水位特征统计分析
    @GetMapping(value = "/yuqing/lishi_zgswtj")
    public PageInfo<LSYQShuiWeiTJ> findByZGSWTJ(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                @RequestParam(value = "STGR", required = false) String STGR,
                                                @RequestParam(value = "STNM", required = false) String STNM,
                                                @RequestParam(value = "YR", required = false) String YR) {
        return liShiYuQingService.findByZGSWTJ(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, YR);
    }

    //历史数据的年表雨量最高水位列表查询
    @GetMapping(value = "/yuqing/lishi_zgswlb")
    public PageInfo<LSYQZGSWLieBiao> findByZGSWLieBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                       @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                       @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                       @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                       @RequestParam(value = "STGR", required = false) String STGR,
                                                       @RequestParam(value = "STNM", required = false) String STNM,
                                                       @RequestParam(value = "YR", required = false) String YR) {
        return liShiYuQingService.findByZGSWLieBiao(_page, _page_size, ADDVCD, Canal_Code, STGR, STNM, YR);
    }
}
