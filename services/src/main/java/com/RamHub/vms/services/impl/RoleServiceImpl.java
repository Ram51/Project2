package com.cuberootz.vms.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuberootz.vms.dataAccess.entity.Role;
import com.cuberootz.vms.dataAccess.repo.RoleRepository;
import com.cuberootz.vms.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepo;
	
	@Override
	public List<Object> getRoleList() {
		List<Role> roles = roleRepo.findAll();
		return new ArrayList<Object>(roles);
	}

}

