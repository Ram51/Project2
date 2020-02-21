package com.cuberootz.vms.services.user;

import org.springframework.stereotype.Service;

import com.cuberootz.vms.dataAccess.entity.User;
import com.cuberootz.vms.pojo.UserDetail;
import com.cuberootz.vms.pojo.UserPojo;
import com.cuberootz.vms.pojo.UserRoleMappingPojo;
import com.cuberootz.vms.services.impl.VmsException;

@Service
public interface UserService {
	
	public UserPojo getUsers();
	public User getUserByUsername(String userName);
	public UserPojo createUser(String username, String password,Boolean isAdmin,
			String createdBy);
	public UserDetail getUserData(String user) throws VmsException;
	public UserRoleMappingPojo addRoleToUser(String user, Long role, String username) throws VmsException;
}
