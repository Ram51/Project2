package com.cuberootz.vms.services.impl;

import java.net.URISyntaxException;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cuberootz.vms.restTemplate.RestClient;
import com.cuberootz.vms.services.ExternalCallService;

@Service
public class ExternalCallServiceImpl implements ExternalCallService{

	private static Logger log = LoggerFactory.getLogger(ExternalCallServiceImpl.class);
	
	RestClient call = new RestClient();

	@Override
	public Object externalPost(String url, JSONObject jsonString) {
		String result = "";
		try {
			result = call.post(url, jsonString);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("++++Sku is:"+result);
		return result;
	}

	@Override
	public Object externalGetCall(String url) {
		String result = "";
		result = call.get(url);
		log.info("++++Sku is:"+result);
		return result;
	}

}
