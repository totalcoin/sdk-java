package com.totalcoin.java.sdk.service;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.totalcoin.java.sdk.request.AuthorizeRequest;
import com.totalcoin.java.sdk.response.MerchantResponse;

public class MerchantService {
	private static final String URI = "https://api.totalcoin.com/ar-test/Merchant/";

	private RestTemplate template = new RestTemplate();

	public MerchantResponse call(AuthorizeRequest request, String tokenId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		MerchantResponse response = template.getForObject(URI + tokenId, MerchantResponse.class, request);
		return response;
	}

}
