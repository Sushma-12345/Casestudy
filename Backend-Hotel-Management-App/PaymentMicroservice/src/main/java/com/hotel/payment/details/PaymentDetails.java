package com.hotel.payment.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PaymentDetails")
public class PaymentDetails {
		@Id
		private String guestId;
		private String totalamount;
		private String paytime;
		private String creditcardDetails;
		
	    public String getGuestId() {
				return guestId;
		}
	    public void setGuestId(String guestId) {
				this.guestId = guestId;
		}
		
		public PaymentDetails() {
			super();
		}
		public String getTotal() {
			return totalamount;
		}
		public void setTotal(String total) {
			this.totalamount = totalamount;
		}
		public String getPaytime() {
			return paytime;
		}
		public void setPaytime(String paytime) {
			this.paytime = paytime;
		}
		public String getCreditcardDetails() {
			return creditcardDetails;
		}
		public void setCreditcardDetails(String creditcardDetails) {
			this.creditcardDetails = creditcardDetails;
		}
		
		
		public PaymentDetails(String guestId, String totalamount, String paytime, String creditcardDetails) {
			super();
			this.guestId = guestId;
			this.totalamount = totalamount;
			this.paytime = paytime;
			this.creditcardDetails = creditcardDetails;
		}
		
		
		
		
		
		
}