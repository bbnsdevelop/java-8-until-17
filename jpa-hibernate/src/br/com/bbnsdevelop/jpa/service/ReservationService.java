package br.com.bbnsdevelop.jpa.service;

import br.com.bbnsdevelop.jpa.db.CustomerDao;
import br.com.bbnsdevelop.jpa.entities.Customer;

public class ReservationService {

	private CustomerDao dao;

	public ReservationService() {
		this.dao = new CustomerDao();
	}

	public String save(Customer customer) {
		dao.openTransaction()
			.save(customer.getSeat())
			.save(customer)
			.closeTransaction()
			.closeConnection();
		return "Successfully to save the reservation in database id: " + customer.getId();
	}

}
