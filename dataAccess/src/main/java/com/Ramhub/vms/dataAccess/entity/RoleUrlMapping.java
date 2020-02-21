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
public class RoleUrlMapping {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "role_id", nullable = false)
	private Long roleId;
	@Column(name = "url")
	private String url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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

	public RoleUrlMapping() {
	}
	@Override
	public String toString() {
		return "RoleUrlMapping [id=" + id + ", roleId=" + roleId + ", url=" + url + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
