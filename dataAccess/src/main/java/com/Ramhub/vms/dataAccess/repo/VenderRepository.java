package com.cuberootz.vms.dataAccess.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuberootz.vms.dataAccess.entity.User;
import com.cuberootz.vms.dataAccess.entity.Vender;

@Repository
public interface VenderRepository  extends JpaRepository<Vender, Long> {
	public Vender findByName(String username);
	
	
}
