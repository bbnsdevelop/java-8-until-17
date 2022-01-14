package br.com.bbnsdevelop.adapter;

import br.com.bbnsdevelop.adapter.adapters.MercadoPagoAdapter;
import br.com.bbnsdevelop.adapter.adapters.PayoneerAdapter;
import br.com.bbnsdevelop.adapter.mercadopago.MercadoPago;
import br.com.bbnsdevelop.adapter.payoneer.Payoneer;
import br.com.bbnsdevelop.adapter.paypal.IPaypalPayment;
import br.com.bbnsdevelop.adapter.paypal.PayPal;

public class Main {
	
	
	public static void main(String[] args) {
		
		IPaypalPayment payment = new PayPal();
		
		payment.paypalPayment();
		payment.paypalReceive();
		
		System.out.println("-".repeat(50));
		
		payment = new PayoneerAdapter( new Payoneer());
		payment.paypalPayment();
		payment.paypalReceive();
		
		System.out.println("-".repeat(50));
		
		payment = new MercadoPagoAdapter(new MercadoPago());
		payment.paypalPayment();
		payment.paypalReceive();
	}

}
