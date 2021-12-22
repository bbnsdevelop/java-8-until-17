package br.com.bbnsdevelop.navigable;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableTreeSetDemo {

	
	public static void main(String[] args) {
		
		NavigableMap<Integer, String> t = new TreeMap<>();
		
		
		t.put(10, "A");
		t.put(20, "B");
		t.put(30, "C");
		t.put(40, "D");
		t.put(50, "F");
		t.put(10, "A");
		
		
		
		System.out.println(t);
		
		
		System.out.println(t.ceilingKey(30));
		
		
		System.out.println(t.higherKey(10));
		System.out.println(t);
		
		System.out.println(t.floorKey(20));
		
		
		System.out.println(t.lowerKey(30));
		
		System.out.println(t.pollFirstEntry());
		
		
		System.out.println(t.pollLastEntry());
		
		
		System.out.println(t.descendingMap());
		
		
		System.out.println(t);
	}
}
