package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorizeResponseData {

	@JsonProperty("TokenId")
	private String tokenId;

	@JsonProperty("UserName")
	private String userName;

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "{tokenId=" + tokenId + ", userName="
				+ userName + "}";
	}
	
	
}
