package br.com.bbnsdevelop.regularexpressions;

public class StringEmailValidator {
	
	public static void main(String[] args) {
		String regex = "^[a-zA-z0-9_.-]+@[a-zA-z0-9_.-]+$";

		String email = "john_snow@gmail.com";
		
		if(email.matches(regex)) {
			System.out.println("Valid email: " + email );
		}else {
			System.out.println("Invalid email: " + email );
		}
		
		
	}

}
