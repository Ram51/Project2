package com.cuberootz.vms.pojo;

import java.util.Date;

import com.cuberootz.vms.dataAccess.entity.User;

public class UserPojo {
	
    
    private Long id;
    private String userName;
    private String password;
    private Boolean isAdmin;
    private String createdBy;
    private Date createdDate;
 
    public UserPojo() {
		
	}

    public UserPojo(User user) {
    	id = user.getId();
		userName= user.getUserName();
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

	@Override
	public String toString() {
		return "UserPojo [id=" + id + ", userName=" + userName + ", password=" + password + ", isAdmin=" + isAdmin
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + "]";
	}
    
    
}