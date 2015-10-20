package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizeResponse {
	
	@JsonProperty("IsOk")
	private Boolean isok;
	
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Response")
	private AuthorizeResponseData response;

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

	public AuthorizeResponseData getResponse() {
		return response;
	}

	public void setResponse(AuthorizeResponseData response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "{isok=" + isok + ", message=" + message
				+ ", response=" + response + "}";
	}

}
