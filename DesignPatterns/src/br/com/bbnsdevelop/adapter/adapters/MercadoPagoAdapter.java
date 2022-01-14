package br.com.bbnsdevelop.adapter.adapters;

import br.com.bbnsdevelop.adapter.mercadopago.IMercadoPago;
import br.com.bbnsdevelop.adapter.paypal.IPaypalPayment;
import br.com.bbnsdevelop.adapter.ultils.Token;

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
