package com.totalcoin.java.sdk.request;

public class CheckoutRequest {

	private String Amount;
	private String Quantity;
	private String Country;
	private String Currency;
	private String Description;
	private String FailureURL;
	private String PendingURL;
	private String SuccessURL;
	private String PaymentMethods;
	private String Reference;
	private String Site;
	private String MerchantId;
	
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getFailureURL() {
		return FailureURL;
	}
	public void setFailureURL(String failureURL) {
		FailureURL = failureURL;
	}
	public String getPendingURL() {
		return PendingURL;
	}
	public void setPendingURL(String pendingURL) {
		PendingURL = pendingURL;
	}
	public String getSuccessURL() {
		return SuccessURL;
	}
	public void setSuccessURL(String successURL) {
		SuccessURL = successURL;
	}
	public String getPaymentMethods() {
		return PaymentMethods;
	}
	public void setPaymentMethods(String paymentMethods) {
		PaymentMethods = paymentMethods;
	}
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public String getMerchantId() {
		return MerchantId;
	}
	public void setMerchantId(String merchantId) {
		MerchantId = merchantId;
	}

}
