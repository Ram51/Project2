package com.cuberootz.vms.pojo;

import java.util.Date;

public class OrderPojo {
	private long id;
	private Long venderId;
	private String status;
	private String createdBy;
	private Date createdDate;
	private Date updatedDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getVenderId() {
		return venderId;
	}
	public void setVenderId(Long venderId) {
		this.venderId = venderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public OrderPojo() {
		super();
	}
	@Override
	public String toString() {
		return "OrderPojo [id=" + id + ", venderId=" + venderId + ", status=" + status + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
