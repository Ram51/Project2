package com.cuberootz.vms.dataAccess.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuberootz.vms.dataAccess.entity.VmsProperties;

@Repository
public interface VmsPropertyRepository extends JpaRepository<VmsProperties, Long>{
	VmsProperties findByKey(String propertyName);
}
