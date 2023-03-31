package br.com.bbnsdevelop.v1_examples.adapter.adapters;

import br.com.bbnsdevelop.v1_examples.adapter.payoneer.Payoneer;
import br.com.bbnsdevelop.v1_examples.adapter.paypal.IPaypalPayment;
import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public class PayoneerAdapter implements IPaypalPayment{

	private Payoneer payoneer;
	
	
	
	public PayoneerAdapter(Payoneer payoneer) {
		this.payoneer = payoneer;
		System.out.println("Adapter the Payoneer using the methods of Paypal");
	}

	@Override
	public Token authToken() {		
		return new Token();
	}

	@Override
	public void paypalPayment() {		
		this.payoneer.sendPayment();
		
	}

	@Override
	public void paypalReceive() {
		this.payoneer.receivePayment();
		
	}

}
