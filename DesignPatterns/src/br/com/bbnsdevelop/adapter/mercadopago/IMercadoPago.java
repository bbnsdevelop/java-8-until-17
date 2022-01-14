package br.com.bbnsdevelop.adapter.mercadopago;

import br.com.bbnsdevelop.adapter.ultils.Token;

public interface IMercadoPago {
	
	Token authToken();
	void enviadoPagamento();
	void recebendoPagamento();

}
