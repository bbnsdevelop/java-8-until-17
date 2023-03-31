package br.com.bbnsdevelop.v2_examples.proxy;

import java.util.List;

public class CustomerProxyImpl implements Customer {
	
	CustomerImpl customerImpl = new CustomerImpl();

	@Override
	public int getId() {		
		return customerImpl.getId();
	}

	@Override
	public List<Order> getOrders() {
		List<Order> list = List.of(new Order(1, "Iphone", 10), new Order(2, "Macbook Pro", 1), new Order(3, "ZenPhone Asus", 50));
		return list;
	}

}
