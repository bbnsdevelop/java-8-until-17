package br.com.bbnsdevelop.v1_examples.adapter.mercadopago;

import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public interface IMercadoPago {
	
	Token authToken();
	void enviadoPagamento();
	void recebendoPagamento();

}
