package vip.yingmen.web.rest;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import vip.yingmen.domain.SysRole;
import vip.yingmen.domain.WebMenu;
import vip.yingmen.model.WebMenuTreeVoFactory;
import vip.yingmen.repository.SysRoleRepository;
import vip.yingmen.template.BeanTool;
import vip.yingmen.template.CrudTplApi;
import vip.yingmen.vo.WebMenuSaveVo;
import vip.yingmen.vo.WebMenuTreeVo;
import vip.yingmen.vo.WebMenuViewVo;
import vip.yingmen.web.rest.errors.ReqErrorException;

@RestController
@RequestMapping("/guanqu/web/menus")
@Api(tags = "菜单")
public class WebMenuWebApi  extends CrudTplApi <WebMenu,WebMenuSaveVo>  {
	@Autowired private SysRoleRepository sysRoleRepository;
	
	@Override
	@PostMapping("/")
    @ApiOperation(value = "新增")
	@Transactional
	public ResponseEntity<WebMenu> add(@Valid @RequestBody WebMenuSaveVo saveVo) throws URISyntaxException {
		// TODO Auto-generated method stub
		ResponseEntity<WebMenu> res  =  super.add(saveVo);
		Optional<SysRole> sysRoleOptional  = sysRoleRepository.findOneWithEagerRelationshipsByName("超级管理员");
		if (sysRoleOptional.isPresent()) {
			 sysRoleOptional.get().addWebMenu(BeanTool.getEntityOnlyHasId(res.getBody().getId(), WebMenu.class));
			 sysRoleRepository.save(sysRoleOptional.get());
		}
		return res;
	}

	@Override
	protected Class<WebMenu> getTargetClass() {
		// TODO Auto-generated method stub
		return WebMenu.class;
	}

	@Override
	protected void saveBefore(WebMenu enetiy, WebMenuSaveVo saveVo) {
		// TODO Auto-generated method stub
		if (saveVo.getFatherId() != null) {
			enetiy.setFather(BeanTool.getEntityOnlyHasId(saveVo.getFatherId(), WebMenu.class));
		}
		
		
	}
		
//		@Autowired private WebMenuRepository queryRepository;
	    @Autowired  private WebMenuTreeVoFactory webMenuTreeVoFactory;
	 	@GetMapping("/list")
	    @ApiOperation(value = "列表")
	 	@Transactional(readOnly = true)
	    public ResponseEntity<List<WebMenuTreeVo>> getWebMenuList() {
	        List<WebMenu> allList = super.jpaTplService.findListByExample(new WebMenu());
	        List<WebMenuTreeVo> restList = webMenuTreeVoFactory.getTreeList(allList);
			return ResponseEntity.ok(restList);
	    }

	 	 @GetMapping("/{id}/view")
	     @ApiOperation(value = "查询")
	     @Transactional(readOnly = true)
	     public ResponseEntity<WebMenuViewVo> getView(@PathVariable Long id) {
	 		 WebMenu entity = repository.findById(id).orElseThrow(()-> new ReqErrorException("ID 错误"));
	     	 this.setWebUserName(entity);
	     	 WebMenuViewVo webMenuViewVo = WebMenuViewVo.getInstance(entity);
	 		 return ResponseEntity.ok(webMenuViewVo);
	     }

		
	
}
