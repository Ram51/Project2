package com.cuberootz.vms.restTemplate;

import java.net.URISyntaxException;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;

	public RestClient() {
		this.rest = new RestTemplate();
		headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
	}


	public String get(String uri) {
		HttpEntity<String> requestEntity = new HttpEntity<String>(uri, headers);
		ResponseEntity<String> responseEntity = rest.exchange( uri, HttpMethod.GET, requestEntity,
				String.class);
		this.setStatus(responseEntity.getStatusCode());
		return responseEntity.getBody();
	}

	public String post(String uri, JSONObject instruction) throws URISyntaxException {
		HttpEntity<String> entity = new HttpEntity<String>(instruction.toString(),headers);
		return rest.postForObject(uri, entity, String.class);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
