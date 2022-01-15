package br.com.bbnsdevelop.v1_examples.ChainOfResponsibility.server;

import java.util.HashMap;
import java.util.Map;

import br.com.bbnsdevelop.v1_examples.ChainOfResponsibility.middlewares.Middleware;

public class UserServer {
	
	
	private Map<String, String> users = new HashMap<>();
	
	private Middleware middleware;

	public void setMiddleware(Middleware middleware) {
		this.middleware = middleware;
	}
	
	
	public boolean LogIn(String email, String password) {
		if(middleware.check(email, password)) {
			System.out.println("User Authorized");
			return true;
		}
		return false;
	}
	
	public void registerUser(String email, String password) {
		users.put(email, password);
	}
	
	public boolean hasEmail(String email) {
		return users.containsKey(email);
	}
	
	public boolean isValidPassword(String email, String password) {
		return users.get(email).equals(password);
	}

}
