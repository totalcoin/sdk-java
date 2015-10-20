package com.totalcoin.java.sdk.service;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.totalcoin.java.sdk.request.IpnRequest;
import com.totalcoin.java.sdk.response.IpnResponse;

public class IpnService {
	private static final String URI = "https://api.totalcoin.com/ar-test/Ipn/";

	private RestTemplate template = new RestTemplate();

	public IpnResponse call(String tokenId, IpnRequest request) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		IpnResponse response = template.getForObject(URI + tokenId + "/" + request.getReference(), IpnResponse.class);
		return response;
	}

}
