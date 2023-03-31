package br.com.bbnsdevelop.v2_examples.facade;

public class OrderFacade {
	
	private OrderProcessor processor = new OrderProcessor();		
	
	public void processOrder(String product, int quantity ) {
		if(processor.checkStock(product)) {
			String order = processor.placeOrder(product, quantity);
			processor.shipOrder(order);
		}
	}

}
