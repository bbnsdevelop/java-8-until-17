package br.com.bbnsdevelop.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
	
		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("def");
		list.add("xyz");
		list.add("abc");
		list.add("lmo");
		
		
		ListIterator<String> listIterator = list.listIterator();
		
		System.out.println("Traversing the list in the forward direction");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("Traversing the list in the backward direction");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
