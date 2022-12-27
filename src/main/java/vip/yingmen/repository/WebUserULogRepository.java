package vip.yingmen.repository;

import vip.yingmen.domain.WebUserULog;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the WebUserULog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WebUserULogRepository extends JpaRepository<WebUserULog, Long>, JpaSpecificationExecutor<WebUserULog> {

}
