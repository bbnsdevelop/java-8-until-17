package br.com.bbnsdevelop.collectionsUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList2 {

	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		
		l.add("L");
		l.add("A");
		l.add("C");
		l.add("X");
		l.add("W");
		l.add("Z");
		l.add("T");
		
		
		System.out.println("Before sorting: " + l);
		
		
		Collections.sort(l, new MyComparator());
		
		
		System.out.println("After sorting: " + l);
		
	}
}
