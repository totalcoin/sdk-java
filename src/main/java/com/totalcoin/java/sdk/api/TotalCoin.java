package com.totalcoin.java.sdk.api;

import com.totalcoin.java.sdk.request.AuthorizeRequest;
import com.totalcoin.java.sdk.request.CheckoutRequest;
import com.totalcoin.java.sdk.request.IpnRequest;
import com.totalcoin.java.sdk.response.AuthorizeResponse;
import com.totalcoin.java.sdk.response.CheckoutResponse;
import com.totalcoin.java.sdk.response.IpnResponse;
import com.totalcoin.java.sdk.response.MerchantResponse;
import com.totalcoin.java.sdk.service.AuthorizeService;
import com.totalcoin.java.sdk.service.CheckoutService;
import com.totalcoin.java.sdk.service.IpnService;
import com.totalcoin.java.sdk.service.MerchantService;

public class TotalCoin {

	private AuthorizeRequest authorize;
	private AuthorizeService authService;
	private CheckoutService chService;
	private IpnService ipnService;
	private MerchantService merchService;
	private AuthorizeResponse authResp;
	private String apiKey;

	public TotalCoin(String email, String apiKey) {
		this.apiKey = apiKey;
		this.authorize = new AuthorizeRequest(apiKey, email);
		this.authService = new AuthorizeService();
		this.chService = new CheckoutService();
		this.ipnService = new IpnService();
		this.merchService = new MerchantService();
	}

	public AuthorizeResponse getAccessToken() {
		this.authResp = this.authService.call(this.authorize);
		return this.authResp;
	}
	
	public CheckoutResponse performCheckout(CheckoutRequest chRequest) {
		return chService.call(chRequest, this.authResp.getResponse().getTokenId());
	}
	
	public MerchantResponse getMerchants() {
		return this.merchService.call(this.authorize, this.authResp.getResponse().getTokenId());
	}
	
	public IpnResponse getIpnInfo(String reference) {
		IpnRequest request = new IpnRequest(reference);
		return this.ipnService.call(this.apiKey, request);
	}

}
