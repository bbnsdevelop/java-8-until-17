package br.com.bbnsdevelop.jpa.service;

import java.util.List;

import br.com.bbnsdevelop.jpa.db.FamilyDao;
import br.com.bbnsdevelop.jpa.entities.Nephew;
import br.com.bbnsdevelop.jpa.entities.Uncle;

public class FamilyService {
	
	private FamilyDao dao;
	
	public FamilyService() {
		this.dao = new FamilyDao();
	}
	
	
	public String save(List<Uncle> uncles, List<Nephew> nephews) {
		Uncle uncle1 = uncles.get(0);
		Uncle uncle2 = uncles.get(1);
		Nephew nephew1 = nephews.get(0);
		Nephew nephew2 = nephews.get(1);
		dao.openTransaction().save(uncle1).save(uncle2).save(nephew1).save(nephew2).closeTransaction().closeConnection();
		return "Successfully to save the uncle and nephew in database";
	}

}
