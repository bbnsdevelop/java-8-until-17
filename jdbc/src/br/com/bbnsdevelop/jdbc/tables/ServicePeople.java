package br.com.bbnsdevelop.jdbc.tables;

import java.util.List;

import br.com.bbnsdevelop.jdbc.tables.entities.People;

public class ServicePeople {

	private DAO dao;

	public ServicePeople() {
		this.dao = new DAO();
	}

	public List<People> findAll() {
		return dao.findAll();
	}

	public People findById(int id) {
		return dao.findById(id);
	}

	public String updatePeople(People newPeople) {
		return dao.updatePeople(newPeople);
	}

	public String insertPerson(People p) {
		return dao.insertPerson(p);
	}

	public String deleteById(int id) {
		return dao.deleteById(id);
	}

}
