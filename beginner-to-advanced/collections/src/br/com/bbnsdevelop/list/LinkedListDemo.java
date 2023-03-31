package br.com.bbnsdevelop.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		Object objects[] = new Object[1000000];
		
		for(int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}
		
		LinkedList<Object> list = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken LinkedList: " + (end - start));
		
		System.out.println("--------------------------------");
		
		
		List<Object> list1 = new ArrayList<>();
		start = System.currentTimeMillis();
		for (Object object : objects) {
			list1.add(object);
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time taken List: " + (end - start));
		
	}

}
