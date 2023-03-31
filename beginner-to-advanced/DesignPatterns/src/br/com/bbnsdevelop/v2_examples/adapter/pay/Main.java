package br.com.bbnsdevelop.v2_examples.adapter.pay;

public class Main {
	
	public static void main(String[] args) {
		
		IPaymentProcessor processor = new PaymentProcessorImpl();
		
		double dollars = 2670.0;
		
		processor.pay(dollars);		
		System.out.println("-".repeat(50));
		
		processor = new PaymentProcessorRupeesAdaptor(new PaymentRupees());
		
		processor.pay(dollars);
	}

}
