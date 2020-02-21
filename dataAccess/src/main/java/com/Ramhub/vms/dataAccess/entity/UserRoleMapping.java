package com.cuberootz.vms.dataAccess.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="user_role_mapping")
public class UserRoleMapping {
	@Id
	@GeneratedValue
    private Long id;
	@Column(name = "role_id", nullable = false)
	private Long roleId;
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name="created_by")
	private String createdBy;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Column
	@UpdateTimestamp()
	private Date updatedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public UserRoleMapping() {
	}
	@Override
	public String toString() {
		return "UserRoleMapping [id=" + id + ", roleId=" + roleId + ", userId=" + userId + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
}
