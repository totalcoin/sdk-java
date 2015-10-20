package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Merchant {
	
	@JsonProperty("Id")
	private String Id;
	
	@JsonProperty("Name")
	private String name;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{Id=" + Id + ", name=" + name + "}";
	}
	
}
