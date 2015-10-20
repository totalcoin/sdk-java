package com.totalcoin.java.sdk.request;

public class AuthorizeRequest {
	
	private String apiKey;
	private String email;

	public AuthorizeRequest(String apiKey, String email) {
		this.apiKey = apiKey;
		this.email = email;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
