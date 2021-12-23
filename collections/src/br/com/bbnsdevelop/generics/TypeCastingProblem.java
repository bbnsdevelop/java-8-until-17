package br.com.bbnsdevelop.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
	
	public static void main(String[] args) {
		String[] s = new String[10];
		s[0] = "Jhon";
		s[1] = "Robot";
		// s[2] = 123; compile erro here
		
		List l = new ArrayList<>();
		
		l.add("Jhon");
		l.add(123);
		
		String name = (String) l.get(0);
		// throw erro -> class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String
		// String number = (String) l.get(1); 
	}

}
