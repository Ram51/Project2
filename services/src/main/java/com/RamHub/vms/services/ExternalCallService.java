package com.cuberootz.vms.services;

import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public interface ExternalCallService 
{
	public Object externalPost(String url, JSONObject jsonString );
    
	public Object externalGetCall(String url);
}
