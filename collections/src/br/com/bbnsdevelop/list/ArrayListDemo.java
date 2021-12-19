package br.com.bbnsdevelop.list;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(20));
		list.add(10); // Autoboxing
		list.add(30.45);
		list.add("Hello");
		
		
		System.out.println(list);
	}
}
