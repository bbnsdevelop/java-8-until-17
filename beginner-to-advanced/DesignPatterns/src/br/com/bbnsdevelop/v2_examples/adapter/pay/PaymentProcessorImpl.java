package br.com.bbnsdevelop.v2_examples.adapter.pay;

public class PaymentProcessorImpl implements IPaymentProcessor{

	@Override
	public void pay(Double dollars) {
		
		System.out.println("Recieved the payment: " + dollars +" dollars");
		
	}

}
