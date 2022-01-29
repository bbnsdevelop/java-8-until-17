package br.com.bbnsdevelop.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bbnsdevelop.jpa.entities.User;

public class UserService {
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	
	public UserService() {
		this.factory = Persistence.createEntityManagerFactory("jpa-hibernate");
		this.manager = factory.createEntityManager(); 
	}
	
	
	public String createUser(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		return "Successfully to save the user in database";
	}

}
