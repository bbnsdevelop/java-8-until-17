package br.com.bbnsdevelop.concurrencecollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

	// Has error ConcurrentModificationException
	// static HashMap<String, String> coursesRating = new HashMap<String, String>();
	
	static ConcurrentHashMap<String, String> coursesRating = new ConcurrentHashMap<String, String>();

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coursesRating.put("Terraform", "5.0");
	}

	public static void main(String[] args) {

		ArraySetProblem a = new ArraySetProblem();
		a.start();

		coursesRating.put("Java", "5.0");
		coursesRating.put("Python", "4.8");
		coursesRating.put("C", "5.0");
		coursesRating.put("C++", "4.0");
		coursesRating.put("JavaScript", "4.7");
		coursesRating.put("Angular", "5.0");
		coursesRating.put("Docker", "5.0");
		coursesRating.put("Kubernetes", "5.0");

		Iterator<String> iterator1 = coursesRating.keySet().iterator();
		coursesRating.put("NodeJs", "4.0");
		while (iterator1.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String course = iterator1.next();
			System.out.println(coursesRating.get(course));

			if (course.equals("Angular")) {
				coursesRating.remove(course);
			}
		}
		System.out.println("------------After-remove---------------");
		System.out.println(coursesRating);
	}
}
