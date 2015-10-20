package com.totalcoin.java.sdk.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchantResponse {
		
		@JsonProperty("IsOk")
		private Boolean isok;
		
		@JsonProperty("Message")
		private String message;
		
		@JsonProperty("Response")
		private List<Merchant> response;

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

		public List<Merchant> getResponse() {
			return response;
		}

		public void setResponse(List<Merchant> response) {
			this.response = response;
		}
		
		public List<Merchant> getMerchants() {
			return response;
		}

		public void setMerchants(List<Merchant> merchants) {
			this.response = merchants;
		}

		@Override
		public String toString() {
			return "{isok=" + isok + ", message=" + message
					+ ", response=" + response + "}";
		}

}
