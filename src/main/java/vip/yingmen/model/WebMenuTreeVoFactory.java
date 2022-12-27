package vip.yingmen.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import vip.yingmen.domain.SysRole;
import vip.yingmen.domain.WebMenu;
import vip.yingmen.repository.SysRoleRepository;
import vip.yingmen.template.BeanCopierMapper;
import vip.yingmen.vo.WebMenuTreeVo;
import vip.yingmen.web.rest.errors.ReqErrorException;

@Service
public class WebMenuTreeVoFactory {

	@Autowired private SysRoleRepository sysRoleRepository;
	
	public List<WebMenuTreeVo> getSysRoleWebMenuTree(Long id) {
		SysRole sysRole = this.sysRoleRepository.findOneWithEagerRelationships(id)
			 .orElseThrow(()-> new ReqErrorException("ID 错误"));
		List<WebMenuTreeVo> restList = 
			   getTreeList(Lists.newArrayList(sysRole.getWebMenus()) );
		return restList;
	}
	
	public List<WebMenu> getSysRoleWebMenuListByNoChildrens(Long id) {
		SysRole sysRole = this.sysRoleRepository.findOneWithEagerRelationships(id)
			 .orElseThrow(()-> new ReqErrorException("ID 错误"));
		List<WebMenu> list = Lists.newArrayList();
		Set<WebMenu> fatherSet = Sets.newHashSet();
		for (WebMenu webMenu : sysRole.getWebMenus()) {
			if (webMenu.isDelFlag()) {
				continue;
			}
			if (webMenu.getFather() != null) {
				fatherSet.add(webMenu.getFather());
			}
		}
		for (WebMenu webMenu : sysRole.getWebMenus()) {
			if (webMenu.isDelFlag()) {
				continue;
			}
			if (!fatherSet.contains(webMenu)) {
				list.add(webMenu);
			}
		}
		return list;
	}
	
	public List<WebMenuTreeVo> getTreeList(List<WebMenu> allList) {
		List<WebMenuTreeVo> restList = Lists.newArrayList();
		Multimap<Long, WebMenu> fatherMap = HashMultimap.create();
		for (WebMenu webMenu : allList) {
			if (webMenu.isDelFlag()) {
				continue;
			}
			
			if (webMenu.getFather() == null) {
				WebMenuTreeVo vo = getVo(webMenu);
				restList.add(vo);
			}else {
				fatherMap.put(webMenu.getFather().getId(), webMenu);
			}
		}
		restList.sort(Comparator.comparingInt(WebMenuTreeVo::getIndex));
		for (WebMenuTreeVo webMenuTreeVo : restList) {
			setChilds(fatherMap, webMenuTreeVo);
		}
		return restList;
	}

	private void setChilds(Multimap<Long, WebMenu> fatherMap, WebMenuTreeVo webMenuTreeVo) {
		Collection<WebMenu> chlids = fatherMap.get(webMenuTreeVo.getId());
		for (WebMenu webMenuTreeVoChlid : chlids) {
			WebMenuTreeVo vo = getVo(webMenuTreeVoChlid);
			setChilds(fatherMap,vo);
			webMenuTreeVo.children.add(vo);
		}
		if (!webMenuTreeVo.children.isEmpty()) {
			webMenuTreeVo.children.sort(Comparator.comparingInt(WebMenuTreeVo::getIndex));
		}
		
	}

	private WebMenuTreeVo getVo(WebMenu webMenu) {
		WebMenuTreeVo vo = new WebMenuTreeVo();
		BeanCopierMapper.copyObject(webMenu, vo);
		return vo;
	}
	
}
