package vip.yingmen.web.rest;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import vip.yingmen.domain.SysRole;
import vip.yingmen.domain.SysRole_;
import vip.yingmen.domain.WebMenu;
import vip.yingmen.model.WebMenuTreeVoFactory;
import vip.yingmen.repository.SysRoleRepository;
import vip.yingmen.template.BeanTool;
import vip.yingmen.template.CrudTplApi;
import vip.yingmen.template.QueryJpaTplService;
import vip.yingmen.vo.PageData;
import vip.yingmen.vo.SysRoleSaveVo;
import vip.yingmen.vo.SysRoleVo;
import vip.yingmen.vo.WebMenuTreeVo;

@RestController
@RequestMapping("/guanqu/web/sys-roles")
@Api(tags = "角色")
public class SysRoleWebApi  extends CrudTplApi <SysRole,SysRoleSaveVo>  {
	
	
    @GetMapping("/all-vo-list")
    @ApiOperation(value = "值列表(无查询条件)")
    @Transactional(readOnly = true)
	public ResponseEntity<List<SysRoleVo>> getAllSysRoleVoList() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(jpaTplService.findListByExample(new SysRole())
				.stream()
				.map(SysRoleVo::getInstance)
				.collect(Collectors.toList())
				);
	}
    
    @GetMapping("/{id}/vo")
    @ApiOperation(value = "查询值")
    @Transactional(readOnly = true)
    public ResponseEntity<SysRoleVo> getVo(@PathVariable Long id) {
		return ResponseEntity.ok( SysRoleVo.getInstance(super.get(id).getBody())   ) ;
	}

	@Override
	protected Class<SysRole> getTargetClass() {
		// TODO Auto-generated method stub
		return SysRole.class;
	}

	@Override
	protected void saveBefore(SysRole enetiy, SysRoleSaveVo saveVo) {
		
	}
		
	@Autowired private SysRoleRepository queryRepository;
 	@GetMapping("/page")
    @ApiOperation(value = "分页列表")
 	@Transactional(readOnly = true)
    public ResponseEntity<PageData<SysRoleVo>> getSysRolePage(Pageable pageable
    		,@ApiParam(value = "角色名称", required = false) @RequestParam(required = false) String name) {
 		
        Specification<SysRole> spec = Specification.where(null);
        spec =  QueryJpaTplService.setIsDelQuery(spec);
        spec =  QueryJpaTplService.like(spec, SysRole_.name, name);
		Page<SysRole> page = queryRepository.findAll(spec , pageable);
        for (SysRole enetity : page) {
			super.setWebUserName(enetity);
		}
		return ResponseEntity.ok(PageData.getInstance(page,SysRoleVo::getInstance));
    }		

	@Override
	@Deprecated
	public ResponseEntity<List<SysRole>> getAllList() {
		// TODO Auto-generated method stub
		return super.getAllList();
	}

	@Override
	@Deprecated
	public ResponseEntity<List<SysRole>> getAllPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return super.getAllPage(pageable);
	}

	@Override
	@Deprecated
	public ResponseEntity<SysRole> get(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@PutMapping("/{id}/menus")
    @ApiOperation(value = "赋权")
    public ResponseEntity<SysRole> updateWebMenus(@PathVariable Long id,@Valid @RequestBody Set<Long> menuIds) throws URISyntaxException {
		 SysRole sysRole = this.jpaTplService.getOne(id);
		 sysRole.setWebMenus(BeanTool.getEntitySetOnlyHasId(menuIds, WebMenu.class));
		 return  ResponseEntity.ok(jpaTplService.saveEntity(sysRole));
    }
  	
	 @Autowired  private WebMenuTreeVoFactory webMenuTreeVoFactory;
 	
		@GetMapping("/{id}/menus")
	    @ApiOperation(value = "赋权菜单")
	    public ResponseEntity<List<WebMenuTreeVo>>  getWebMenus(@PathVariable Long id) throws URISyntaxException {
			    List<WebMenuTreeVo> restList = webMenuTreeVoFactory.getSysRoleWebMenuTree(id);
				return ResponseEntity.ok(restList);
	    }
		@GetMapping("/{id}/-user/menuids/no-childrens")
	    @ApiOperation(value = "获取赋权菜单Id数组(无孩子)")
	 	@Transactional(readOnly = true)
		public ResponseEntity<List<Long>> getByOnlineUsermMenusByNoChildrens(@PathVariable Long id) {
			 List<WebMenu> restList =  webMenuTreeVoFactory.getSysRoleWebMenuListByNoChildrens(id);
			 return ResponseEntity.ok(
					 restList.stream()
					 .map(WebMenu::getId)
					 .collect(Collectors.toList())
					 );
		}

		@DeleteMapping("/batch-v1")
	    @ApiOperation(value = "批量删除角色 v1")
	    @Transactional
	    public ResponseEntity<Void> batchDeleteData(@RequestBody  Set<Long> ids) {
	    	for (Long id : ids) {
	    		jpaTplService.deleteData(id);
			}
	        return ResponseEntity.ok().build();
	    } 	
		
}
