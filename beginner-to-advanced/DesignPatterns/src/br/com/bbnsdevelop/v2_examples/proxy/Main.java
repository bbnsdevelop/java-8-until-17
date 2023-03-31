package br.com.bbnsdevelop.v2_examples.proxy;

public class Main {
	
	
	public static void main(String[] args) {
		Customer customer = new CustomerProxyImpl();
		
		System.out.println(customer.getId());
		System.out.println(customer.getOrders());
	}

}
