package br.com.bbnsdevelop.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
		return "Successfully to save the user in database id: " + user.getId();
	}
	
	public User findUserById(Long id) {
		return manager.find(User.class, id);
	}
	
	public List<User> findAll(){		
		String jpql = "select u from User u";		
		TypedQuery<User> query = manager.createQuery(jpql, User.class);		
		List<User> users = query.getResultList();
		
		return users;
	}
	

}
