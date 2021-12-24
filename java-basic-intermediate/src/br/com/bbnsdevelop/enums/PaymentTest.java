package br.com.bbnsdevelop.enums;

public class PaymentTest {
	
	public static void main(String[] args) {
		System.out.println(PaymentType.DEBITCARD);
		
		PaymentType pt = PaymentType.CREDITCARD;
		
		System.out.println(pt);
		
		System.out.println("---------------Enum-methods-----------------");
		
		PaymentType[] values = PaymentType.values();
		
		for (PaymentType paymentType : values) {
			System.out.println(paymentType);
			
			System.out.println(paymentType.ordinal());
		}
	}

}
