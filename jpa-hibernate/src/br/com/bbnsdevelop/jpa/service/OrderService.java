package br.com.bbnsdevelop.jpa.service;

import br.com.bbnsdevelop.jpa.db.OderGenericDao;
import br.com.bbnsdevelop.jpa.entities.ItemOrder;

public class OrderService {
	
	private OderGenericDao dao;
	
	public OrderService() {
		this.dao = new OderGenericDao();
	}
	
	public String save(ItemOrder item) {
		dao.openTransaction().save(item.getProduct()).save(item.getOrder()).save(item).closeTransaction().closeConnection();
		return "Successfully to save the item order in database id: " + item.getId();
	}

}
