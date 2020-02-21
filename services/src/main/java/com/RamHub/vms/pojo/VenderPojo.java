package com.cuberootz.vms.pojo;

import java.util.Date;

import javax.persistence.Column;

import com.cuberootz.vms.dataAccess.entity.Vender;

public class VenderPojo {

	private Long id;
	private String name;
	private String address;
	private String locality;
	private String city;
	private int pincode;
	private String landmark;
	private Double latitude;
	private Double longitude;
	private String contacPersonName;
	private Integer contactPrimaryNumber;
	private Integer contactAlternativeNumber;
	private String vendorType;
	private  String GSTN;
	private String TAN;
	private String document;
	private String shopImage;
	
	public VenderPojo() {
		
	}
    
	public VenderPojo(Vender vender) {
		this.id = vender.getId();
		this.name = vender.getName();
		this.address =vender.getAddress();
		this.city =vender.getCity();
		this.pincode =vender.getPincode();
		this.landmark =vender.getLandmark();
		this.latitude =vender.getLatitude();
		this.longitude =vender.getLongitude();
		this.contacPersonName = vender.getContacPersonName();
		this.contactPrimaryNumber =vender.getContactPrimaryNumber();
		this.contactAlternativeNumber =vender.getContactAlternativeNumber();
		this.vendorType =vender.getVendorType();
		this.GSTN = vender.getGSTN();
		this.TAN =vender.getTAN();
		this.document =vender.getDocument();
		this.shopImage =vender.getShopImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getContacPersonName() {
		return contacPersonName;
	}

	public void setContacPersonName(String contacPersonName) {
		this.contacPersonName = contacPersonName;
	}

	public Integer getContactPrimaryNumber() {
		return contactPrimaryNumber;
	}

	public void setContactPrimaryNumber(Integer contactPrimaryNumber) {
		this.contactPrimaryNumber = contactPrimaryNumber;
	}

	public Integer getContactAlternativeNumber() {
		return contactAlternativeNumber;
	}

	public void setContactAlternativeNumber(Integer contactAlternativeNumber) {
		this.contactAlternativeNumber = contactAlternativeNumber;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public String getGSTN() {
		return GSTN;
	}

	public void setGSTN(String gSTN) {
		GSTN = gSTN;
	}

	public String getTAN() {
		return TAN;
	}

	public void setTAN(String tAN) {
		TAN = tAN;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getShopImage() {
		return shopImage;
	}

	public void setShopImage(String shopImage) {
		this.shopImage = shopImage;
	}

	@Override
	public String toString() {
		return "VenderPojo [id=" + id + ", name=" + name + ", address=" + address + ", locality=" + locality + ", city="
				+ city + ", pincode=" + pincode + ", landmark=" + landmark + ", latitude=" + latitude + ", longitude="
				+ longitude + ", contacPersonName=" + contacPersonName + ", contactPrimaryNumber="
				+ contactPrimaryNumber + ", contactAlternativeNumber=" + contactAlternativeNumber + ", vendorType="
				+ vendorType + ", GSTN=" + GSTN + ", TAN=" + TAN + ", document=" + document + ", shopImage=" + shopImage
				+ "]";
	}
	
	

}
