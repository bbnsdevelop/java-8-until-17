package br.com.bbnsdevelop.concurrencecollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread{
	
	// Has error ConcurrentModificationException
	// static HashSet<String> courses1 = new HashSet<String>();
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>();
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Terraform");
	}

	public static void main(String[] args) {

		ArraySetProblem a = new ArraySetProblem();
		a.start();
		

		courses.add("Java");
		courses.add("Python");
		courses.add("C");
		courses.add("C++");
		courses.add("JavaScript");
		courses.add("Angular");
		courses.add("Docker");
		courses.add("Kubernetes");

		Iterator<String> iterator1 = courses.iterator();
		courses.add("NodeJs");
		while (iterator1.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String course = iterator1.next();
			System.out.println(course);
			
			if (course.equals("Angular")) {
				courses.remove(course);
			}
		}
		System.out.println("------------After-remove---------------");
		System.out.println(courses);
	}

}
