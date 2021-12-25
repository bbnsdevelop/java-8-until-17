package br.com.bbnsdevelop.interfaces.predicates.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

		Predicate<String> predicate = x -> x.startsWith("A");
		
		System.out.println(StringProcessor.filter(list, predicate));

		System.out.println(StringProcessor.filter(list, x -> x.startsWith("A") && x.length() == 3));

	}

}
