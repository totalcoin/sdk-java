package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckoutResponse {
	
	@JsonProperty("IsOk")
	private Boolean isok;
	
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Response")
	private CheckoutResponseData response;

	public Boolean getIsok() {
		return isok;
	}

	public void setIsok(Boolean isok) {
		this.isok = isok;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CheckoutResponseData getResponse() {
		return response;
	}

	public void setResponse(CheckoutResponseData response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "{isok=" + isok + ", message=" + message
				+ ", response=" + response + "}";
	}

}
