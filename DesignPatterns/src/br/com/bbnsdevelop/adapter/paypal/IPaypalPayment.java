package br.com.bbnsdevelop.adapter.paypal;

import br.com.bbnsdevelop.adapter.ultils.Token;

public interface IPaypalPayment {
	
	Token authToken();
	void paypalPayment();
	void paypalReceive();
	

}
