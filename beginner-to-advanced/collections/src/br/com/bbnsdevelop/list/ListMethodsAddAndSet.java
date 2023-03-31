package br.com.bbnsdevelop.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsAddAndSet {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 10; i <= 100; i = i +10) {
			list.add(i);
		}
	
		System.out.println(list);
		
		list.add(1,25);
		
		System.out.println("List after insert: " + list);
		
		list.set(2, 28);
		
		System.out.println("List after replacement index: " + list);
	}

}
