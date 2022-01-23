package br.com.bbnsdevelop.v2_examples.facade;

import java.util.Random;

public class OrderProcessor {
	
	public boolean checkStock(String name) {
		System.out.println("Checking stock");
		return true;
	}
	
	public String placeOrder(String name, int quantity) {
		System.out.println("Order placed");
		Random random = new Random(100000);
		long nextLong = random.nextLong();
		String response = String.valueOf(nextLong);
		System.out.println(response);
		return response;
	}
	
	public void shipOrder(String orderId) {
		System.out.println("Order Shipped: ".concat(orderId));
	}

}
