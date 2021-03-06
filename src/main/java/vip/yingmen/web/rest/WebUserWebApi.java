package vip.yingmen.web.rest;

import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Objects;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import vip.yingmen.domain.SysRole;
import vip.yingmen.domain.SysRole_;
import vip.yingmen.domain.WebMenu;
import vip.yingmen.domain.WebUser;
import vip.yingmen.domain.WebUser_;
import vip.yingmen.domain.enumeration.WebUserStatus;
import vip.yingmen.model.WebMenuTreeVoFactory;
import vip.yingmen.repository.WebUserRepository;
import vip.yingmen.security.SecurityUtils;
import vip.yingmen.template.BeanCopierMapper;
import vip.yingmen.template.BeanTool;
import vip.yingmen.template.CrudSaveTplApi;
import vip.yingmen.template.QueryJpaTplService;
import vip.yingmen.vo.PageData;
import vip.yingmen.vo.PasswdChangeVo;
import vip.yingmen.vo.WebMenuTreeVo;
import vip.yingmen.vo.WebUserAdminUpdateVo;
import vip.yingmen.vo.WebUserSaveVo;
import vip.yingmen.vo.WebUserUpdateVo;
import vip.yingmen.web.rest.errors.ReqErrorException;

@RestController
@RequestMapping("/guanqu/web/users")
@Api(tags = "Web??????")
public class WebUserWebApi  extends CrudSaveTplApi <WebUser,WebUserSaveVo,WebUserAdminUpdateVo>  {
	
	@Override
	@PostMapping("/")
    @ApiOperation(value = "??????")
	@Transactional
	public ResponseEntity<WebUser> add(@Valid @RequestBody WebUserSaveVo saveVo) throws URISyntaxException {
		if (StringUtils.isBlank(saveVo.getPasswd())) {
			throw ReqErrorException.getInstance("??????????????????");
		}
		if (StringUtils.isBlank(saveVo.getConfirmPasswd())) {
			throw ReqErrorException.getInstance("????????????????????????");
		}
		if (!Objects.equal(saveVo.getPasswd(), saveVo.getConfirmPasswd())) {
			throw ReqErrorException.getInstance("??????????????????????????????");
		}
		if (webUserRepository.queryByLogin(saveVo.getLogin()).isPresent()) {
			throw ReqErrorException.getInstance("???????????????:"+saveVo.getLogin());
		}
		
		return super.add(saveVo);
	}

	@Override
	@PutMapping("/")
    @ApiOperation(value = "??????")
	@Transactional
	public ResponseEntity<WebUser> update(@Valid @RequestBody WebUserAdminUpdateVo saveVo) throws URISyntaxException {
//		if (!Objects.equal(saveVo.getPasswd(), saveVo.getConfirmPasswd())) {
//			throw ReqErrorException.getInstance("??????????????????????????????");
//		}
		
		return super.update(saveVo);
	}


	

//	@Override
//	public ResponseEntity<WebUser> get(@PathVariable Long id) {
//		ResponseEntity<WebUser> res = super.get(id);
////		res.getBody().passwd("****");
//		return res;
//	}

	

	@Override
	protected Class<WebUser> getTargetClass() {
		// TODO Auto-generated method stub
		return WebUser.class;
	}

	@Override
	protected void addBefore(WebUser enetiy, WebUserSaveVo saveVo) {
		// TODO Auto-generated method stub
		enetiy.setRole(BeanTool.getEntityOnlyHasId(saveVo.getRoleId(), SysRole.class));
	}
		
	@Override
	protected void updateBefore(WebUser enetiy, WebUserAdminUpdateVo saveVo) {
		// TODO Auto-generated method stub
		enetiy.setRole(BeanTool.getEntityOnlyHasId(saveVo.getRoleId(), SysRole.class));
	}
	@Autowired private WebUserRepository queryRepository;
	
 	@GetMapping("/online-user")
    @ApiOperation(value = "????????????????????????")
 	@Transactional(readOnly = true)
	public ResponseEntity<WebUser> getByOnlineUser() {
		WebUser user = getWebUserByLogin();
		super.setWebUserName(user);
		return ResponseEntity.ok(user);
	}

	private WebUser getWebUserByLogin() {
		String login = SecurityUtils.getCurrentUserLogin()
    			.orElseThrow(()->ReqErrorException.getInstance("?????????"));
		return getWebUserByLogin(login);
	}
	private WebUser getWebUserByLogin(String login) {
		WebUser user  = this.queryRepository.queryByLogin(login)
    			.orElseThrow(()->ReqErrorException.getInstance("????????????"));
		return user;
	}
 	@Autowired  private WebMenuTreeVoFactory webMenuTreeVoFactory;
 	
 	@GetMapping("/online-user/menus")
    @ApiOperation(value = "???????????????????????????????????????")
 	@Transactional(readOnly = true)
	public ResponseEntity<List<WebMenuTreeVo>> getByOnlineUsermMenus() {
		 WebUser user = getWebUserByLogin();
		 List<WebMenuTreeVo> restList =  webMenuTreeVoFactory.getSysRoleWebMenuTree(user.getRole().getId());
		 return ResponseEntity.ok(restList);
	}
 	
	@GetMapping("/online-user/menuids/no-childrens")
    @ApiOperation(value = "???????????????????????????????????????Id??????(?????????)")
 	@Transactional(readOnly = true)
	public ResponseEntity<List<Long>> getByOnlineUsermMenusByNoChildrens() {
		 WebUser user = getWebUserByLogin();
		 List<WebMenu> restList =  webMenuTreeVoFactory.getSysRoleWebMenuListByNoChildrens(user.getRole().getId());
		 return ResponseEntity.ok(
				 restList.stream()
				 .map(WebMenu::getId)
				 .collect(Collectors.toList())
				 );
	}
	
	@GetMapping("/menuids/no-childrens")
    @ApiOperation(value = "???????????????????????????????????????Id??????(?????????)")
 	@Transactional(readOnly = true)
	public ResponseEntity<List<Long>> getByOnlineUsermMenusByNoChildrens(
			@ApiParam(value = "??????", required = true) @RequestParam(required = true) String login) {
		 WebUser user = getWebUserByLogin(login);
		 List<WebMenu> restList =  webMenuTreeVoFactory.getSysRoleWebMenuListByNoChildrens(user.getRole().getId());
		 return ResponseEntity.ok(
				 restList.stream()
				 .map(WebMenu::getId)
				 .collect(Collectors.toList())
				 );
	}
	
 	
 	@PutMapping("/online-user")
    @ApiOperation(value = "??????????????????????????????(id?????????)")
 	@Transactional
	public ResponseEntity<WebUser> updateByOnlineUser(@Valid @RequestBody WebUserUpdateVo saveVo) throws URISyntaxException {
		 if (saveVo.getId() != null) {
	            throw new ReqErrorException("Id ???????????? ");
	      }
		String login = SecurityUtils.getCurrentUserLogin()
    			.orElseThrow(()->ReqErrorException.getInstance("?????????"));
		WebUser user  = this.queryRepository.queryByLogin(login)
    			.orElseThrow(()->ReqErrorException.getInstance("????????????"));
		saveVo.setId(user.getId());
		 return  ResponseEntity.ok(jpaTplService.saveAndCopy(saveVo
			 		,var->{
			 			  if (StringUtils.isNotBlank(saveVo.getNewPasswd())) {
			 				 var.setPasswd(saveVo.getNewPasswd());
						}
			 		}
			 ));
	}
	
	
 	@GetMapping("/page")
    @ApiOperation(value = "????????????")
 	@Transactional(readOnly = true)
    public ResponseEntity<PageData<WebUser>> getWebUserWePage(Pageable pageable
    		,@ApiParam(value = "????????????", required = false) @RequestParam(required = false) String name
    		,@ApiParam(value = "??????", required = false) @RequestParam(required = false) String login
    		,@ApiParam(value = "??????ID", required = false) @RequestParam(required = false) Long sysRoleId
    		,@ApiParam(value = "???????????????: NORMAL(??????)FREEZE(??????)", required = false) @RequestParam(required = false) WebUserStatus status) {
 		
        Specification<WebUser> spec = Specification.where(null);
        spec =  QueryJpaTplService.setIsDelQuery(spec);
        spec =  QueryJpaTplService.like(spec, WebUser_.name, name);
        spec =  QueryJpaTplService.like(spec, WebUser_.login, login);
        spec =  QueryJpaTplService.equal(spec, WebUser_.role,SysRole_.id, sysRoleId);
        spec =  QueryJpaTplService.equal(spec, WebUser_.status, status);
        Page<WebUser> page = queryRepository.findAll(spec , pageable);
        for (WebUser webUser : page) {
			super.setWebUserName(webUser);
			webUser.role(BeanCopierMapper.copyObject(webUser.getRole(), SysRole.class));
		}
		return ResponseEntity.ok(PageData.getInstance(page));
    }		
		
 	@PutMapping("/{id}/passwd")
    @ApiOperation(value = "????????????")
    public ResponseEntity<WebUser> updateWebUser(@PathVariable Long id,@Valid @RequestBody PasswdChangeVo passwdChangeVo) throws URISyntaxException {
 		 WebUser webUser = this.jpaTplService.getOne(id);
		 if (!Objects.equal(passwdChangeVo.oldPasswd, webUser.getPasswd())) {
			throw ReqErrorException.getInstance("???????????????");
		 }
		 webUser.passwd(passwdChangeVo.newPasswd);
		 return  ResponseEntity.ok(jpaTplService.saveEntity(webUser));
    }


}
