package vip.yingmen.repository;

import vip.yingmen.domain.OnlineWebUser;
import vip.yingmen.domain.WebUser;

import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the OnlineWebUser entity.
 */
@Repository
public interface OnlineWebUserRepository extends JpaRepository<OnlineWebUser, Long>, JpaSpecificationExecutor<OnlineWebUser> {
//	Optional<OnlineWebUser> findByWebUserAndLoginIpAndDelFlagFalse(WebUser webUser,String loginIp);

	Optional<OnlineWebUser> findByWebUserAndLoginIp(WebUser user, String loginIp);
}
