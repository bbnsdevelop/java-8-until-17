package br.com.bbnsdevelop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PairNumber {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Elements from array:");
		for (int i = 0; i < array1.length; i++) {
			int element = array1[i];

			if (element % 2 == 0) {
				System.out.println("pair number: " + element);
			}
		}
		List<Integer> nums = Arrays.stream(array1).boxed().collect(Collectors.toList());		
		System.out.println("--------------Predicate----------------------------");
		Predicate<Integer> test = n -> n% 2 == 0;		
		nums.stream().filter(test).forEach(System.out::println);		
		
		System.out.println("--------------Filter----------------------------");		
		nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
