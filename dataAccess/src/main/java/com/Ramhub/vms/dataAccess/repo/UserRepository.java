package com.cuberootz.vms.dataAccess.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuberootz.vms.dataAccess.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUserName(String username);
}
