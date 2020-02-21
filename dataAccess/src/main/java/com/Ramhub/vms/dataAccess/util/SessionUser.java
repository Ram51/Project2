package com.cuberootz.vms.dataAccess.util;

import java.util.Date;
import java.util.List;

public class SessionUser {

	private Long id;
	private String userName;
	private String password;
	private Boolean isAdmin;
	private String createdBy;
	private Date createdDate;
	private List<String> roleList;
	
	public SessionUser(String userName, String password, Boolean isAdmin, List<String> roleList) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.roleList = roleList;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public List<String> getRoleList() {
		return roleList;
	}


	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}
}
