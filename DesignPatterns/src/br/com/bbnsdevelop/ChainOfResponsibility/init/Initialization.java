package br.com.bbnsdevelop.ChainOfResponsibility.init;

import br.com.bbnsdevelop.ChainOfResponsibility.middlewares.CheckPermission;
import br.com.bbnsdevelop.ChainOfResponsibility.middlewares.CheckUserMiddleware;
import br.com.bbnsdevelop.ChainOfResponsibility.middlewares.Middleware;
import br.com.bbnsdevelop.ChainOfResponsibility.server.UserServer;

public class Initialization {
	
	private UserServer server;
	
	public Initialization(){
		this.server = new UserServer();
		this.server.registerUser("snow@gmail.com", "Asdf123!@#-*");
		this.server.registerUser("user@gmail.com", "1234");
	}
	
	
	public UserServer get() {
		Middleware middleware = new CheckUserMiddleware(server);
		middleware.linkWith(new CheckPermission());
		this.server.setMiddleware(middleware);
		return this.server;
	}

}
