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
public class Vender {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="Name")
	private String name;
	@Column(name="Address")
	private String address;
	@Column(name="Locality")
	private String locality;
	@Column(name="City")
	private String city;
	@Column(name="Pincode")
	private Integer pincode;
	@Column (name="Landmark")
	private String landmark;
	@Column(name="latitude")
	private Double Latitude;
	@Column(name="Longitude")
	private Double longitude;
	@Column(name="Contact_Person_Name")
	private String contacPersonName;
	@Column(name="Contact_Primary_Number")
	private Integer contactPrimaryNumber;
	@Column(name="Contact_Alternative_Number")
	private Integer contactAlternativeNumber;
	@Column(name="Vendor_Type")
	private String vendorType;
	@Column(name="GST_number")
	private String GSTN;
	@Column(name="TAN")
	private String TAN;
	@Column(name="Document")
	private String document;
	@Column(name="Shop_Image")
	private String shopImage;	
	
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

	public Integer getPincode() {
		return pincode;
	}

	public void setPinCode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public Double getLatitude() {
		return Latitude;
	}

	public void setLatitude(Double latitude) {
		Latitude = latitude;
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

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
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
	public String toString()
	{
		return "Vender [id=" + id + ", name=" + name + ", address=" + address + ", locality=" + locality + ", city="
				+ city + ", pincode=" + pincode + ", landmark=" + landmark + ", Latitude="
				+ Latitude + ", longitude=" + longitude + ", contacPersonName=" + contacPersonName
				+ ", contactPrimaryNumber=" + contactPrimaryNumber + ", contactAlternativeNumber="
				+ contactAlternativeNumber + ", vendorType=" + vendorType + ", GSTN=" + GSTN + ", TAN=" + TAN
				+ ", document=" + document + ", shopImage=" + shopImage + "]";
	}
	
}

