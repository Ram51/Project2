package com.cuberootz.vms.dataAccess.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuberootz.vms.dataAccess.entity.RoleUrlMapping;

@Repository
public interface RoleUrlMappingRepository extends JpaRepository<RoleUrlMapping, Long>{

	List<RoleUrlMapping> findByRoleId(long l);
	List<RoleUrlMapping> findByRoleIdIn(List<Long> roleIds);

}
