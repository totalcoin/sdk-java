package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckoutResponseData {
	
	@JsonProperty("URL")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "{url=" + url + "}";
	}
}
