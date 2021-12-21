package br.com.bbnsdevelop.set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
	
	
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("abc");
		set.add("xyz");
		set.add("def");
		set.add("mno");
		set.add("fgh");
		set.add("pqr");
		set.add("abc");
		
		
		for (String element : set) {
			System.out.println(element);
		}
		
	}

}
