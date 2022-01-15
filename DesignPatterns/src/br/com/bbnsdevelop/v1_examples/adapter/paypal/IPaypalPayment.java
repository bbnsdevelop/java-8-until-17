package br.com.bbnsdevelop.v1_examples.adapter.paypal;

import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public interface IPaypalPayment {
	
	Token authToken();
	void paypalPayment();
	void paypalReceive();
	

}
