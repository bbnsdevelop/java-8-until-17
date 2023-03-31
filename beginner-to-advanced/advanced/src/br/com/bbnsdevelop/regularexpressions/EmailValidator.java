package br.com.bbnsdevelop.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	public static void main(String[] args) {
		String input = "john_snow1540@gmail.com";
		String regex = "^[a-zA-z0-9_.-]+@[a-zA-z0-9_.-]+$";
		
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches()) {
			System.out.println("Valid email: " + input );
		}else {
			System.out.println("Invalid email: " + input );
		}
		
		
	}

}
