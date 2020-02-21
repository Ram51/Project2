package com.cuberootz.vms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cuberootz.vms.pojo.VenderPojo;

@Service
public interface VenderService {

	public VenderPojo createVendor(String name, String address, String locality, String city, Integer pinCode, String landmark, Double latitude, Double longitude, String contacPersonName, Integer contactPrimaryNumber, Integer contactAlternativeNumber, String vendorType, String GSTN,String TAN, String document, String shopImage );

	List<VenderPojo> getPartners();

	VenderPojo getVenderDetails(Long venderId);

	public VenderPojo saveVender(String name, String address, String city, Integer pincode, String landmark,
			Double latitude, Double longitude, String contacPersonName, Integer contactPrimaryNumber,
			Integer contactAlternativeNumber, String vendorType, String gstn, String document, String shopImage);

}
