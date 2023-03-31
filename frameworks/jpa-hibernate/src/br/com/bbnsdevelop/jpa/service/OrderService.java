package br.com.bbnsdevelop.jpa.service;

import br.com.bbnsdevelop.jpa.db.OrderDao;
import br.com.bbnsdevelop.jpa.db.OrderGenericDao;
import br.com.bbnsdevelop.jpa.entities.ItemOrder;
import br.com.bbnsdevelop.jpa.entities.Order;

public class OrderService {
	
	private OrderGenericDao dao;
	private OrderDao orderDao;
	
	public OrderService() {
		this.dao = new OrderGenericDao();
		this.orderDao = new OrderDao();
	}
	
	public String save(ItemOrder item) {
		dao.openTransaction().save(item.getProduct()).save(item.getOrder()).save(item).closeTransaction().closeConnection();
		return "Successfully to save the item order in database id: " + item.getId();
	}
	
	public Order findById(Long id) {		
		return orderDao.findById(id);
	}

}
