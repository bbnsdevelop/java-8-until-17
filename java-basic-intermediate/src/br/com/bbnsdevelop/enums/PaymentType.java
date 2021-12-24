package br.com.bbnsdevelop.enums;

public enum PaymentType {
	DEBITCARD(5), CREDITCARD(0), CASH(10);
	
	int fee;
	
	private PaymentType(int fee) {
		this.fee = fee;
	}
	
	public int getFee() {
		return this.fee;
	}
}
