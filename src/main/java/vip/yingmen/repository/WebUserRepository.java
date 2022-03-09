package vip.yingmen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vip.yingmen.domain.WebUser;


/**
 * Spring Data  repository for the WebUser entity.
 */
@Repository
public interface WebUserRepository extends JpaRepository<WebUser, Long>, JpaSpecificationExecutor<WebUser> {
	@Query("select entity.name from #{#entityName} entity where entity.login = ?1 and entity.delFlag = false")
	Optional<String> queryNameByLogin(String login);
	
	
	@Query("select entity from #{#entityName} entity where entity.login = ?1 and entity.delFlag = false")
	Optional<WebUser> queryByLogin(String login);
}
