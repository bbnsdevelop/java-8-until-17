package br.com.bbnsdevelop.adapter.payoneer;

import br.com.bbnsdevelop.adapter.ultils.Token;

public interface IPayoneerPayment {
	
	Token authToken();
	void sendPayment();
	void receivePayment();
	

}
