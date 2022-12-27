package vip.yingmen.model;

import java.time.Instant;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vip.yingmen.domain.SysRole;
import vip.yingmen.domain.WebUser;
import vip.yingmen.domain.enumeration.WebUserStatus;
import vip.yingmen.repository.SysRoleRepository;
import vip.yingmen.repository.WebUserRepository;
@Component
public class WebUserDataInit implements CommandLineRunner {
	@Autowired private WebUserRepository webUserRepository;
	@Autowired private SysRoleRepository sysRoleRepository;
	@Override
	public void run(String... args) throws Exception {
		initData();
		
	}
	@Transactional
	private void initData() {
		Optional<SysRole> sysRoleOptional  = sysRoleRepository.findByName("超级管理员");
		SysRole sysRole;
		if (sysRoleOptional.isPresent()) {
			sysRole = sysRoleOptional.get();
		}else{
			sysRole = new SysRole()
					 .name("超级管理员")
					 .delFlag(Boolean.FALSE)
					 .creator("system")
					 .ctime(Instant.now())
					 .modifier("system")
					 .upTime(Instant.now())
					;
			sysRole = sysRoleRepository.save(sysRole);
		};
		Optional<WebUser> webUserOptional  = webUserRepository.queryByLogin("admin");
		if(!webUserOptional.isPresent()){
			WebUser admin = new WebUser()
					.name("admin")
					.login("admin")
					.passwd("admin")
					.status(WebUserStatus.NORMAL)
					.role(sysRole)
					 .delFlag(Boolean.FALSE)
					 .creator("system")
					 .ctime(Instant.now())
					 .modifier("system")
					 .upTime(Instant.now())
					;
			webUserRepository.save(admin);
		}
	}

}
