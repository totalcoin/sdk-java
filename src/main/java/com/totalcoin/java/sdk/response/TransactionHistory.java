package com.totalcoin.java.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionHistory {

	@JsonProperty("Date")
	private String date;
	
	@JsonProperty("TransactionState")
	private String transactionState;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}

	@Override
	public String toString() {
		return "{date=" + date
				+ ", transactionState=" + transactionState + "}";
	}
}
