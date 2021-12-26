package br.com.bbnsdevelop.interfaces.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GreaterThanTwenty {

	public static void main(String[] args) {

		Predicate<Integer> p = number -> number > 20;

		List<Integer> numbers = Arrays.asList(1, 21, 23, 25, 60, 40, 2, 3, 4, 5, 6, 8, 9);

		List<Integer> numberGreaterTwenty = numbers.stream().filter(p).collect(Collectors.toList());

		System.out.println(numberGreaterTwenty);
		
		System.out.println("-----------Return-boolean---------------------");
		System.out.println("Result: " + p.test(20));
		System.out.println("Result: " + p.test(21));
	}

}
