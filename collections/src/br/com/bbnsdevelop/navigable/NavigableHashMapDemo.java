package br.com.bbnsdevelop.navigable;

import java.util.TreeSet;

public class NavigableHashMapDemo {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<>();
		
		
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(10);
		
		
		
		System.out.println(t);
		
		
		System.out.println(t.ceiling(30));
		
		
		System.out.println(t.higher(10));
		System.out.println(t);
		
		System.out.println(t.floor(20));
		
		
		System.out.println(t.lower(30));
		
		System.out.println(t.pollFirst());
		
		
		System.out.println(t.pollLast());
		
		
		System.out.println(t.descendingSet());
		
		
		System.out.println(t);
	}
}
