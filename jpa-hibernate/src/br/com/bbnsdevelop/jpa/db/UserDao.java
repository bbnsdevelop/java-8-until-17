package br.com.bbnsdevelop.jpa.db;

import br.com.bbnsdevelop.jpa.entities.User;

public class UserDao extends DAO<User>{
	
	public UserDao(){
		super(User.class);
	}

}
