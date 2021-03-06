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

		System.out.println("As this list is generic, we need check the what kind of data");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Integer) {
				System.out.println("Is Integer value: " + list.get(i));
			} else if (list.get(i) instanceof Double) {
				System.out.println("Is Double value: " + list.get(i));
			} else if (list.get(i) instanceof String) {
				System.out.println("Is String value: " + list.get(i));
			}

		}
		System.out.println();
		// restrict the type of value
		System.out.println("restrict the type of value");
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(Integer.valueOf(20));
		list1.add(10); // Autoboxing
		// list1.add(30.45);
		// list1.add("Hello");
		
		
		for(Integer element: list1) {
			System.out.println(element);
		}
	}
}
