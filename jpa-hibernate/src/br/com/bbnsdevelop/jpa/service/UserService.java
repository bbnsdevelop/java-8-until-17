package br.com.bbnsdevelop.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bbnsdevelop.jpa.db.UserDao;
import br.com.bbnsdevelop.jpa.entities.User;

public class UserService {

	private EntityManager manager;
	private EntityManagerFactory factory;
	private UserDao dao;

	public UserService() {
		this.factory = Persistence.createEntityManagerFactory("jpa-hibernate");
		this.manager = factory.createEntityManager();
		this.dao = new UserDao();
	}

	public String createUser(User user) {
		dao.saveAtomic(user).closeConnection();
		return "Successfully to save the user in database id: " + user.getId();
	}

	public User findUserById(Long id) {
		return manager.find(User.class, id);
	}

	public List<User> findAll() {
		return dao.getAll();
	}

	public String update(User user) {
		manager.getTransaction().begin();
		manager.detach(user); // this command is to evidence manager status, if you don't put detach from time
								// to time the JPA save the object in database, because, it's on context
								// transaction
		manager.merge(user);
		manager.getTransaction().commit();

		return "Successfully to update the user in database id: " + user.getId();
	}

	public String delete(User user) {
		manager.getTransaction().begin();
		manager.remove(user);

		manager.getTransaction().commit();
		return "Successfully to delete the user in database";

	}

	public void close() {
		dao.closeConnection();
		factory.close();

	}

}
