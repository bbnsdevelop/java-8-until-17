package br.com.bbnsdevelop.ChainOfResponsibility.middlewares;

public class CheckPermission extends Middleware {

	private final static  String ADMIN_EMAIL = "snow@gmail.com";
	
	@Override
	public boolean check(String email, String password) {
		if(email.equals(ADMIN_EMAIL)) {
			System.out.println("Welcome Sys Admin: ".concat(email));
			return true;
		}
		System.out.println("Welcome: ".concat(email));
		return checkNext(email, password);
	}

}
