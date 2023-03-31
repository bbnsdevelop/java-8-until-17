package br.com.bbnsdevelop.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Random obj = new Random();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			int number = obj.nextInt(5);
			list.add(number);
		}
		
		System.out.println(list);
		
		
		HashSet<Integer> hasSset = new HashSet<>(list);
		System.out.println(hasSset);
		
		for (int i = 0; i <= 10; i++) {
			int number = obj.nextInt(5);
			hasSset.add(number);
		}
		// no reapt the numbers in hashSet
		System.out.println(hasSset);
		
	}

}
