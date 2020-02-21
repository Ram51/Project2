package com.cuberootz.vms.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuberootz.vms.dataAccess.entity.Vender;
import com.cuberootz.vms.dataAccess.repo.VenderRepository;
import com.cuberootz.vms.pojo.VenderPojo;
import com.cuberootz.vms.services.VenderService;

@Service
public class VenderServiceImpl implements VenderService {

	private static Logger log = LoggerFactory.getLogger(VenderServiceImpl.class);


           @Autowired
           VenderRepository venderRepo;
		  
		  @Override
		  public VenderPojo createVendor(String name, String address, String
		  locality, String city, Integer pinCode, String landmark, Double latitude,
		  Double longitude, String contacPersonName, Integer contactPrimaryNumber,
		  Integer contactAlternativeNumber, String vendorType, String GSTN,String TAN,
		  String document, String shopImage )
		  {
			  Vender vender = new Vender();
			  vender.setName(name); vender.setAddress(address);
			  vender.setLocality(locality); vender.setCity(city);
			  vender.setPincode(pinCode); vender.setLandmark(landmark);
			  vender.setLatitude(latitude); vender.setLongitude(longitude);
			  vender.setContacPersonName(contacPersonName);
			  vender.setContactPrimaryNumber(contactPrimaryNumber);
			  vender.setContactAlternativeNumber(contactAlternativeNumber);
			  vender.setGSTN(GSTN);
			  vender.setTAN(TAN);
			  vender.setVendorType(vendorType);
			  vender.setDocument(document);
			  vender.setShopImage(shopImage);
			  
			  venderRepo.save(vender);
			  
			  VenderPojo venderPojo= new VenderPojo();
			  venderPojo.setId(vender.getId());
			  return venderPojo;
		  }
		  
		  @Override
		  public List<VenderPojo> getPartners() 
		  {
			  List<VenderPojo> vendersPojo = new ArrayList<VenderPojo>();
			  List<Vender> venders = venderRepo.findAll();
			  for(Vender p : venders)
			  {
				  VenderPojo vender = new VenderPojo(p);
				  vendersPojo.add(vender);
			  }
			  return vendersPojo;
		 }
		  
		  @Override
		  public VenderPojo getVenderDetails(Long venderId) 
		  {
			 Vender vender = venderRepo.findOne(venderId);
			 VenderPojo venderPojo = new VenderPojo(vender);
			 return venderPojo; 
          }

		@Override
		public VenderPojo saveVender(String name, String address, String city, Integer pincode, String landmark,
				Double latitude, Double longitude, String contacPersonName, Integer contactPrimaryNumber,
				Integer contactAlternativeNumber, String vendorType, String gstn, String document, String shopImage) {
			// TODO Auto-generated method stub
			return null;
		}
}
 