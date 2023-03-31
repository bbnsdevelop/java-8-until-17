package br.com.bbnsdevelop.set;

import java.util.Set;
import java.util.TreeSet;

import br.com.bbnsdevelop.comparator.StringComparator;

public class StringTreeSet {
	
	
	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());
		
		set.add("abcxyz");
		set.add("xyzabcdefg");
		set.add("def");
		set.add("mno");
		set.add("fghiiiiiiiiiiiii");
		set.add("pqr");
		set.add("abc");
		
		
		for (String element : set) {
			System.out.println(element);
		}
	}

}
