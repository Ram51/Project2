package com.cuberootz.vms.dataAccess.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Role {
	@Id
	@GeneratedValue
    private Long id;
	@Column(name="role_name")
    private String roleName;
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	
	public Role() {}
	
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
}

