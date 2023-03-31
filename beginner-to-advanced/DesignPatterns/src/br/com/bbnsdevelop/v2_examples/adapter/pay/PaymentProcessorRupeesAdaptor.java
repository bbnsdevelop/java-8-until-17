package br.com.bbnsdevelop.v2_examples.adapter.pay;

public class PaymentProcessorRupeesAdaptor implements IPaymentProcessor {
	
	private static final double RUPEES = 74.27;
	private PaymentRupees paymentRupees;
	
	
	PaymentProcessorRupeesAdaptor(PaymentRupees paymentRupees){
		this.paymentRupees = paymentRupees;
	}
	

	@Override
	public void pay(Double value) {
		
		Float convert  = (float) (value.floatValue() * RUPEES);
		
		paymentRupees.pay(convert);
		
	}

}
