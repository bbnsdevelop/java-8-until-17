package br.com.bbnsdevelop.concurrencecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<String>();

		courses.add("Java");
		courses.add("Python");
		courses.add("C");
		courses.add("C++");
		courses.add("JavaScript");
		courses.add("Angular");
		courses.add("Docker");
		courses.add("Kubernetes");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			// Has error ConcurrentModificationException
			// courses.add("NodeJs");

			if (course.equals("Angular")) {
				// Has error ConcurrentModificationException
				// courses.remove(course);
			}
		}
		System.out.println("----------------------------");
		CopyOnWriteArrayList<String> courses1 = new CopyOnWriteArrayList<String>();

		courses1.add("Java");
		courses1.add("Python");
		courses1.add("C");
		courses1.add("C++");
		courses1.add("JavaScript");
		courses1.add("Angular");
		courses1.add("Docker");
		courses1.add("Kubernetes");

		Iterator<String> iterator1 = courses1.iterator();
		courses1.add("NodeJs");
		while (iterator1.hasNext()) {
			String course = iterator1.next();
			System.out.println(course);
			
			if (course.equals("Angular")) {
				courses1.remove(course);
			}
		}
		System.out.println("------------After-remove---------------");
		System.out.println(courses1);
	}

}
