package br.com.bbnsdevelop.jpa.db;

import br.com.bbnsdevelop.jpa.entities.Order;

public class OrderDao extends DAO<Order>{
	
	public OrderDao(){
		super(Order.class);
	}

}
