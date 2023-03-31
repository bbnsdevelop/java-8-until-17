package br.com.bbnsdevelop.v1_examples.ChainOfResponsibility.middlewares;

import br.com.bbnsdevelop.v1_examples.ChainOfResponsibility.server.UserServer;

public class CheckUserMiddleware extends Middleware {
	
	private UserServer server;
	
	
	public CheckUserMiddleware(UserServer server) {
		this.server = server;
	}

	@Override
	public boolean check(String email, String password) {
		if(!server.hasEmail(email)) {
			System.out.println("Email invalid");
			return false;
		}
		if(!server.isValidPassword(email, password)) {
			System.out.println("Email or Password invalid");
			return false;
		}		
		return checkNext(email, password);
	}

}
