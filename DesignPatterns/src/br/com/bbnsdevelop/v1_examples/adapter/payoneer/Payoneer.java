package br.com.bbnsdevelop.v1_examples.adapter.payoneer;

import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public class Payoneer implements IPayoneerPayment {

	@Override
	public Token authToken() {		
		return new Token();
	}

	@Override
	public void sendPayment() {
		System.out.println("Get token");
		authToken();
		System.out.println("Send payment with Payoneer");

	}

	@Override
	public void receivePayment() {
		System.out.println("Receive payment with Payoneer");

	}

}
