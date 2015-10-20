package com.totalcoin.java.sdk.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IpnResponseData {
	
	@JsonProperty("Reference")
	private String reference;
	
	@JsonProperty("MerchantReference")
	private String merchantReference;
	
	@JsonProperty("TransactionType")
	private String transactionType;
	
	@JsonProperty("Reason")
	private String reason;
	
	@JsonProperty("Currency")
	private String currency;
	
	@JsonProperty("PaidAmount")
	private String paidAmount;
	
	@JsonProperty("NetAmount")
	private String netAmount;
	
	@JsonProperty("FinancingCost")
	private String financingCost;
	
	@JsonProperty("TotalAmount")
	private String totalAmount;
	
	@JsonProperty("TransactionHistories")
	private List<TransactionHistory> transactionHistories;
	
	@JsonProperty("Merchant")
	private Merchant merchant;
	
	@JsonProperty("FromUser")
	private User fromUser;
	
	@JsonProperty("ToUser")
	private User toUser;
	
	@JsonProperty("Provider")
	private Provider provider;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMerchantReference() {
		return merchantReference;
	}

	public void setMerchantReference(String merchantReference) {
		this.merchantReference = merchantReference;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getFinancingCost() {
		return financingCost;
	}

	public void setFinancingCost(String financingCost) {
		this.financingCost = financingCost;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<TransactionHistory> getTransactionHistories() {
		return transactionHistories;
	}

	public void setTransactionHistories(
			List<TransactionHistory> transactionHistories) {
		this.transactionHistories = transactionHistories;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public User getToUser() {
		return toUser;
	}

	public void setToUser(User toUser) {
		this.toUser = toUser;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "{reference=" + reference
				+ ", merchantReference=" + merchantReference
				+ ", transactionType=" + transactionType + ", reason=" + reason
				+ ", currency=" + currency + ", paidAmount=" + paidAmount
				+ ", netAmount=" + netAmount + ", financingCost="
				+ financingCost + ", totalAmount=" + totalAmount
				+ ", transactionHistories=" + transactionHistories
				+ ", merchant=" + merchant + ", fromUser=" + fromUser
				+ ", toUser=" + toUser + ", provider=" + provider + "}";
	}

}
