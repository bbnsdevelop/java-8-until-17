package br.com.bbnsdevelop.set;

import java.util.Set;
import java.util.TreeSet;

import br.com.bbnsdevelop.comparator.StringBufferComparator;

public class CustomizeStringBufferComparableDemo {
	
	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet<>(new StringBufferComparator());
		
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
		
	}

}
