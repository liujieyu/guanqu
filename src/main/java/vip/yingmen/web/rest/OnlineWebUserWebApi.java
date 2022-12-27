package vip.yingmen.web.rest;

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
import vip.yingmen.domain.OnlineWebUser;
import vip.yingmen.domain.OnlineWebUser_;
import vip.yingmen.domain.WebUser_;
import vip.yingmen.model.WebUserFactory;
import vip.yingmen.repository.OnlineWebUserRepository;
import vip.yingmen.template.QueryJpaTplService;
import vip.yingmen.vo.PageData;

@RestController
@RequestMapping("/guanqu/web/online-web-user")
@Api(tags = "在线用户")
public class OnlineWebUserWebApi {
	@Autowired private OnlineWebUserRepository  repository;
	
	@GetMapping("/page")
    @ApiOperation(value = "分页列表")
 	@Transactional(readOnly = true)
    public ResponseEntity<PageData<OnlineWebUser>> getOnlineWebUserPage(Pageable pageable
    		,@ApiParam(value = "用户名称", required = false) @RequestParam(required = false) String name) {
 		
        Specification<OnlineWebUser> spec = Specification.where(null);
        spec = QueryJpaTplService.setIsDelQuery(spec);
        spec = QueryJpaTplService.like(spec, OnlineWebUser_.webUser,WebUser_.name, name);
		Page<OnlineWebUser> page = repository.findAll(spec , pageable);
        for (OnlineWebUser enetity : page) {
        	enetity.setWebUser(WebUserFactory.getNewWebUser(enetity.getWebUser()));
		}
		return ResponseEntity.ok(PageData.getInstance(page));
    }
	
	
}
