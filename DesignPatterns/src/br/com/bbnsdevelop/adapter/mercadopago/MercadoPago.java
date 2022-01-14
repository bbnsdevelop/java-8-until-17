package br.com.bbnsdevelop.adapter.mercadopago;

import br.com.bbnsdevelop.adapter.ultils.Token;

public class MercadoPago implements IMercadoPago {

	@Override
	public Token authToken() {
		
		return new Token();
	}

	@Override
	public void enviadoPagamento() {
		System.out.println("Get token");
		authToken();
		System.out.println("Send payment with mercado pago");

	}

	@Override
	public void recebendoPagamento() {
		System.out.println("Get token");
		authToken();
		System.out.println("receive payment with mercado pago");

	}

}
