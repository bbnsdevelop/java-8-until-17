package br.com.bbnsdevelop.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {
	
	public static void main(String[] args) {
		String input = "11967895224";
		String regex = "^\\d{11}$";
		
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches()) {
			System.out.println("Valid cell: " + input );
		}else {
			System.out.println("Invalid cell: " + input );
		}
		
		
	}

}
