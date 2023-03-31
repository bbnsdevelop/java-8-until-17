package br.com.bbnsdevelop.jpa.db;

import br.com.bbnsdevelop.jpa.entities.Customer;

public class CustomerDao extends DAO<Customer>{
	
	
	public CustomerDao() {
		super(Customer.class);
	}

}
