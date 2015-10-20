package com.totalcoin.java.sdk.service;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.totalcoin.java.sdk.request.CheckoutRequest;
import com.totalcoin.java.sdk.response.CheckoutResponse;

public class CheckoutService {
	private static final String URI = "https://api.totalcoin.com/ar-test/Checkout/";

	private RestTemplate template = new RestTemplate();

	public CheckoutResponse call(CheckoutRequest request, String tokenId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		CheckoutResponse response = template.postForObject(URI + tokenId, request,
				CheckoutResponse.class);
		return response;
	}

}
