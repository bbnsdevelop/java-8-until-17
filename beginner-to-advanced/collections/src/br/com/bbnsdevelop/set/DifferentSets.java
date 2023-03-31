package br.com.bbnsdevelop.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random obj = new Random();

		hashset(obj);
		linkedHashSet(obj);
		treeSet(obj);
	}

	public static void hashset(Random obj) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}

		System.out.println("remove the elements duplicates");
		System.out.println("HashSet elements: " + set);
	}

	public static void linkedHashSet(Random obj) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
		
		System.out.println("keep the order that was added on loop");
		System.out.println("linkedHashSet elements: " + set);
	}
	
	
	public static void treeSet(Random obj) {
		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
		
		System.out.println("will sort the elements");
		System.out.println("TreeSet elements: " + set);
	}

}
