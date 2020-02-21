package com.cuberootz.vms.dataAccess.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cuberootz.vms.dataAccess.entity.UserRoleMapping;

@Repository
public interface UserRoleMappingRepository extends JpaRepository<UserRoleMapping, Long>{

	List<UserRoleMapping> findByUserId(Long id);

	@Query("SELECT ur.roleId FROM com.cuberootz.vms.dataAccess.entity.UserRoleMapping ur where ur.userId=?1")
	List<Long> getRolesByUserId(Long userId);

}
