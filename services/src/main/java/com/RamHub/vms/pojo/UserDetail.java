package com.cuberootz.vms.pojo;

public class UserDetail {
	private Long id;
	private String userName;
	private Boolean isAdmin;
	private String createdBy;
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
	public UserDetail() {
	}
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", userName=" + userName + ", isAdmin=" + isAdmin + ", createdBy=" + createdBy
				+ "]";
	}
}

