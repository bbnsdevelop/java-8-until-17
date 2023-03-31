package br.com.bbnsdevelop.v1_examples.adapter.adapters;

import br.com.bbnsdevelop.v1_examples.adapter.mercadopago.IMercadoPago;
import br.com.bbnsdevelop.v1_examples.adapter.paypal.IPaypalPayment;
import br.com.bbnsdevelop.v1_examples.adapter.ultils.Token;

public class MercadoPagoAdapter implements IPaypalPayment {
	
	private IMercadoPago mercadoPago;

	public MercadoPagoAdapter(IMercadoPago mercadoPago) {

		this.mercadoPago = mercadoPago;
	}

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		mercadoPago.enviadoPagamento();

	}

	@Override
	public void paypalReceive() {
		mercadoPago.recebendoPagamento();

	}

}
