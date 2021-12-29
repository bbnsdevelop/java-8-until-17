package br.com.bbnsdevelop.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
	
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		numbers.forEach(n ->{
			System.out.println("numeros - " + n);
		});
		
		Integer[] arrayNumbers = new Integer [numbers.size()];
		
		List<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(arrayNumbers));
		listNumbers.add(6);
		
		System.out.println(Arrays.toString(arrayNumbers));
		
		System.out.println(listNumbers.toString());
		
	}

}
