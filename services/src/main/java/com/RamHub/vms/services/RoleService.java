package com.cuberootz.vms.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface RoleService {
	List<Object> getRoleList();
}
