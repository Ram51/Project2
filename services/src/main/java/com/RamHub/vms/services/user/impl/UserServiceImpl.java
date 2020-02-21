package com.cuberootz.vms.services.user.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuberootz.vms.dataAccess.entity.User;
import com.cuberootz.vms.dataAccess.entity.UserRoleMapping;
import com.cuberootz.vms.dataAccess.repo.RoleRepository;
import com.cuberootz.vms.dataAccess.repo.UserRepository;
import com.cuberootz.vms.dataAccess.repo.UserRoleMappingRepository;
import com.cuberootz.vms.pojo.UserDetail;
import com.cuberootz.vms.pojo.UserPojo;
import com.cuberootz.vms.pojo.UserRoleMappingPojo;
import com.cuberootz.vms.services.impl.VmsException;
import com.cuberootz.vms.services.user.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserRoleMappingRepository userRoleMappingRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@Override
	public UserPojo getUsers() {
		List<User> users =   userRepository.findAll();
		return new UserPojo(users.get(0));
	}

	@Override
	public User getUserByUsername(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public UserPojo createUser(String userName, String password, Boolean isAdmin, String createdBy) {
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setAdmin(isAdmin);
		user.setCreatedBy(createdBy);
		user.setCreatedDate(new Date());
		userRepository.save(user);
	
		UserPojo userPojo = new UserPojo();
		userPojo.setUserName(userName);
		return userPojo;
	}

	@Override
	public UserDetail getUserData(String user) throws VmsException {
		User userData = userRepository.findByUserName(user);
		UserDetail details = new UserDetail();
		details.setId(userData.getId());
		details.setUserName(user);
		details.setIsAdmin(userData.isAdmin());
		details.setCreatedBy(userData.getCreatedBy());
		
		return details;
	}


	@Override
	public UserRoleMappingPojo addRoleToUser(String user, Long role, String username) throws VmsException {
		User userData = userRepository.findByUserName(user);
		if(userData.isAdmin() == true && role==1)
			throw new VmsException("role", "User is already admin.");
		List<UserRoleMapping> roleMapping = userRoleMappingRepo.findByUserId(userData.getId());
		for(UserRoleMapping mapping : roleMapping) {
			if(mapping.getRoleId().equals(role))
				throw new VmsException("role", "Role already assigned to user");
		}
		
		UserRoleMapping userMapping = new UserRoleMapping();
		userMapping.setRoleId(role);
		userMapping.setUserId(userData.getId());
		userMapping.setCreatedBy(username);
		userMapping.setCreatedDate(new Date());
		userRoleMappingRepo.save(userMapping);
		
		String roleName = roleRepo.findOne(role).getRoleName();
		UserRoleMappingPojo userMappingPojo = new UserRoleMappingPojo();
		userMappingPojo.setUserId(userData.getId());
		userMappingPojo.setUserName(user);
		userMappingPojo.setRoleId(role);
		userMappingPojo.setRoleName(roleName);
		userMappingPojo.setCreatedBy(username);
		return userMappingPojo;
	}
	
	
}
