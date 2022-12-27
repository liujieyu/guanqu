package vip.yingmen.repository;

import vip.yingmen.domain.WebMenu;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the WebMenu entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WebMenuRepository extends JpaRepository<WebMenu, Long>, JpaSpecificationExecutor<WebMenu> {
	
}
