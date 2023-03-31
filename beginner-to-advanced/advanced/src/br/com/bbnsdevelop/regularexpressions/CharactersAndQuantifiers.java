package br.com.bbnsdevelop.regularexpressions;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {
	
	public static void main(String[] args) {
		
		String regex = "[abc]*";
		String input = "ddd"; // false
		// String input = "a"; //true
		boolean matches = Pattern.matches(regex, input);
		
		// is  one digit
		String regex2 = "\\d";
		boolean matches2 = Pattern.matches(regex2, "2");
		
		// is not one digit
		String regex3 = "\\D";
		boolean matches3 = Pattern.matches(regex3, "b");
		
		
		String input2 = "test1";
		String regex4 = "[a-zA-Z0-9]{2,6}";
		boolean matches4 = Pattern.matches(regex4, input2);
		
		
		System.out.println(matches);
		System.out.println(matches2);
		System.out.println(matches3);
		System.out.println(matches4);
	}

}
