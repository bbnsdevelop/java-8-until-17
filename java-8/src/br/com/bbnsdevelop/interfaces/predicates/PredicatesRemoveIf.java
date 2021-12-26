package br.com.bbnsdevelop.interfaces.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicatesRemoveIf {

	public static void main(String[] args) {

		var names = new ArrayList<String>();
		names.add("Jhon");
		names.add("Ana");
		names.add("winter");
		names.add("Eva");
		names.add("Lia");
		names.add("Zoe");
		names.add("Elvis");
		names.add("Bruno");
		names.add("Jan");

		System.out.println("Before remove: " + names);
		Predicate<String> hasNameWithThreeChars = name -> name.length() == 3;
		names.removeIf(hasNameWithThreeChars);

		System.out.println("After remove: " + names);
	}

}
