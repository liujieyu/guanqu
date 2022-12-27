package vip.yingmen.repository;

import vip.yingmen.domain.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the SysRole entity.
 */
@Repository
public interface SysRoleRepository extends JpaRepository<SysRole, Long>, JpaSpecificationExecutor<SysRole> {

    @Query(value = "select distinct sysRole from SysRole sysRole left join fetch sysRole.webMenus",
        countQuery = "select count(distinct sysRole) from SysRole sysRole")
    Page<SysRole> findAllWithEagerRelationships(Pageable pageable);

    @Query("select distinct sysRole from SysRole sysRole left join fetch sysRole.webMenus")
    List<SysRole> findAllWithEagerRelationships();

    @Query("select sysRole from SysRole sysRole left join fetch sysRole.webMenus where sysRole.id =:id")
    Optional<SysRole> findOneWithEagerRelationships(@Param("id") Long id);

    Optional<SysRole>  findByName(String name);
    
    @Query("select sysRole from SysRole sysRole left join fetch sysRole.webMenus where sysRole.name =:name")
    Optional<SysRole> findOneWithEagerRelationshipsByName(@Param("name") String name);
}
