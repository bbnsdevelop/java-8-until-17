package br.com.bbnsdevelop.set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
	
	
	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet<>();
		
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("mno"));
		set.add(new StringBuffer("fgh"));
		set.add(new StringBuffer("pqr"));
		set.add(new StringBuffer("abc"));
		
		for (StringBuffer element : set) {
			System.out.println(element);
		}
		
		System.out.println("If you use the java version 12 plus this code is done");
		System.out.println("Other versions throw exception-------> StringBuffer cannot be cast to java.lang.Comparable");
	}

}
