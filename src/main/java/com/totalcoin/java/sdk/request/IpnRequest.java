package com.totalcoin.java.sdk.request;

public class IpnRequest {
	
	private String reference;

	public IpnRequest(String reference) {
		this.setReference(reference);
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	

}
