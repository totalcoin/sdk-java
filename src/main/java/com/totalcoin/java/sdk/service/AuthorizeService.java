package com.totalcoin.java.sdk.service;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.totalcoin.java.sdk.request.AuthorizeRequest;
import com.totalcoin.java.sdk.response.AuthorizeResponse;

public class AuthorizeService {

	private static final String URI ="https://api.totalcoin.com/ar-test/Security/";

	private RestTemplate template = new RestTemplate();
	
	public AuthorizeResponse call(AuthorizeRequest request){
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    AuthorizeResponse response = template.postForObject(
	    		URI, request, AuthorizeResponse.class);
	    return response;
	}
}
