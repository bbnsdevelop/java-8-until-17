package br.com.bbnsdevelop.jpa;

import br.com.bbnsdevelop.jpa.entities.User;
import br.com.bbnsdevelop.jpa.service.UserService;

public class Main {
	
	
	public static void main(String[] args) {
		
		UserService service = new UserService();
		
		User user = new User("Bob", "bob_marley@gmail.com");
		String response = service.createUser(user);
		
		System.out.println(response);
		
	}

}
