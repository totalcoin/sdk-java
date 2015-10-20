package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Provider {
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("PaymentMethod")
	private String paymentMethod;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "{name=" + name + ", paymentMethod="
				+ paymentMethod + "}";
	}
	
}
