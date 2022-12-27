package vip.yingmen.web.rest;

import java.time.LocalDate;
import java.time.ZoneId;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import vip.yingmen.domain.WebUserULog;
import vip.yingmen.domain.WebUserULog_;
import vip.yingmen.domain.WebUser_;
import vip.yingmen.model.WebUserFactory;
import vip.yingmen.repository.WebUserULogRepository;
import vip.yingmen.template.QueryJpaTplService;
import vip.yingmen.vo.PageData;

@RestController
@RequestMapping("/guanqu/web/user-u-Log")
@Api(tags = "Web账号操作日志")
public class WebUserULogWebApi {
	@Autowired private WebUserULogRepository  repository;
	
	@GetMapping("/page")
    @ApiOperation(value = "分页列表")
 	@Transactional(readOnly = true)
    public ResponseEntity<PageData<WebUserULog>> getAllWebUserULogPage(Pageable pageable
    		,@ApiParam(value = "用户名称", required = false) @RequestParam(required = false) String name
    		,@ApiParam(value = "操作类型", required = false) @RequestParam(required = false) String type
    		,@ApiParam(value = "时间段（开始）", required = false) @RequestParam(required = false) String dateStart
    		,@ApiParam(value = "时间段（结束）", required = false) @RequestParam(required = false) String dateEnd
    		) {
        Specification<WebUserULog> spec = Specification.where(null);
        
        spec = spec.and( (root, query, builder) ->
 			builder.notEqual(root.get(WebUserULog_.type), "")
 		);
        spec =  QueryJpaTplService.like(spec, WebUserULog_.webUser,WebUser_.name, name);
        spec =  QueryJpaTplService.equal(spec,WebUserULog_.type,type);
//        QueryJpaTplService.betweenInstantByLocalDate(spec
//        		, WebUserULog_.time
//        		,dateStart 
//        		,dateEnd
//        		);
//        LocalDate start = LocalDate.parse(dateStart);
//        spec =  QueryJpaTplService.greaterThanOrEqualTo(spec, WebUserULog_.time,
//        		start.atStartOfDay(ZoneId.systemDefault()).toInstant());
//        LocalDate end = LocalDate.parse(dateEnd);
//        spec =  QueryJpaTplService.lessThanOrEqualTo(spec, WebUserULog_.time,
//        		end.atStartOfDay(ZoneId.systemDefault()).plusDays(1).toInstant());
	 	 if (StringUtils.isNotBlank(dateStart)) {
			 LocalDate start = LocalDate.parse(dateStart);
			 spec =  QueryJpaTplService.greaterThanOrEqualTo(spec, WebUserULog_.time
					 ,  start.atStartOfDay(ZoneId.systemDefault()).toInstant());
		 }
		 if (StringUtils.isNotBlank(dateEnd)) {
			 LocalDate end = LocalDate.parse(dateEnd);
			 spec =  QueryJpaTplService.lessThanOrEqualTo(spec,WebUserULog_.time
					 ,  end.atStartOfDay(ZoneId.systemDefault()).plusDays(1).toInstant());
		 }        
		Page<WebUserULog> page = repository.findAll(spec , pageable);
        for (WebUserULog enetity : page) {
        	enetity.setWebUser(WebUserFactory.getNewWebUser(enetity.getWebUser()));
		}
		return ResponseEntity.ok(PageData.getInstance(page));
    }		
}
