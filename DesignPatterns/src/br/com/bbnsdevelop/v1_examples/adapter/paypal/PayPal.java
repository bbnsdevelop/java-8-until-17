package br.com.bbnsdevelop.v1_examples.adapter.paypal;

import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public class PayPal implements IPaypalPayment {

	@Override
	public Token authToken() {

		return new Token();
	}

	@Override
	public void paypalPayment() {
		System.out.println("get token");
		authToken();
		System.out.println("Send payment with paypal");

	}

	@Override
	public void paypalReceive() {
		System.out.println("Receive payment with paypal");

	}

}
