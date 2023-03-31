package br.com.bbnsdevelop.v2_examples.proxy;

import java.util.List;

public class CustomerImpl implements Customer {
	
	private int id;
	private List<Order> orders;
	
	public CustomerImpl() {
		this.id = 1234;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}



}
