package br.com.bbnsdevelop.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsAddAll {
	
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
		
		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		
		list.addAll(4, secondList);
		
		System.out.println("List after add all: " + list);
		
		
		
		if(list.contains(10)) {
			System.out.println("List has the values");
		}
	}

}
