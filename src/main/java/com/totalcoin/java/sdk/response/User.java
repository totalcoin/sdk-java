package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("Phone")
	private String phone;
	
	@JsonProperty("FullName")
	private String fullName;
	
	@JsonProperty("Email")
	private String email;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "{phone=" + phone + ", fullName=" + fullName
				+ ", email=" + email + "}";
	}
}
