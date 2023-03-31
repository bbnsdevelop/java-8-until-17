package br.com.bbnsdevelop.jpa.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class DAO<E> {

	private static EntityManagerFactory factory;
	private EntityManager manager;
	private Class<E> object;

	static {
		try {
			factory = Persistence.createEntityManagerFactory("jpa-hibernate");
		} catch (Exception e) {
			System.out.println("Erro to establish a connection in database!!!");
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> object) {
		this.object = object;
		this.manager = factory.createEntityManager();
	}

	public DAO<E> openTransaction() {
		manager.getTransaction().begin();
		return this;
	}

	public DAO<E> closeTransaction() {
		manager.getTransaction().commit();
		return this;
	}

	public DAO<E> save(E object) {
		manager.persist(object);
		return this;
	}

	public DAO<E> saveAtomic(E object) {

		return this.openTransaction().save(object).closeTransaction();
	}

	public E findById(Object id) {
		return manager.find(object, id);
	}

	public List<E> getAll(int limit, int offset) {

		if (object == null) {
			throw new UnsupportedOperationException("object null");
		}

		String jpql = "select e from " + object.getName() + " e";
		TypedQuery<E> query = manager.createQuery(jpql, object).setMaxResults(limit).setFirstResult(offset);
		return query.getResultList();

	}

	public List<E> getAll() {
		return this.getAll(10, 0);
	}

	public List<E> find(String nameQuery, Object... params) {
		TypedQuery<E> query = manager.createNamedQuery(nameQuery, object);

		for (int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		return query.getResultList();
	}
	
	public E findOne(String nameQuery, Object... params) {
		List<E> list = find(nameQuery, params); 
		return list.isEmpty() ? null : list.get(0); 
	}

	public void closeConnection() {
		manager.close();
	}

}
