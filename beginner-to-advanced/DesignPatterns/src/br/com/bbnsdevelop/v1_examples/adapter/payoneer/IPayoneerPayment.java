package br.com.bbnsdevelop.v1_examples.adapter.payoneer;

import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public interface IPayoneerPayment {
	
	Token authToken();
	void sendPayment();
	void receivePayment();
	

}
