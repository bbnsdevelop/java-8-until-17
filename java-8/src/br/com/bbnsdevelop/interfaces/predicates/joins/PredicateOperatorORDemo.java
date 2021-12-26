package br.com.bbnsdevelop.interfaces.predicates.joins;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOperatorORDemo {

	public static void main(String[] args) {
		Predicate<String> lengthIs3 = x -> x.length() == 3;
		Predicate<String> startWithA = x -> x.startsWith("A");

		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB", "CC", "CCC");
		List<String> collect = list.stream().filter(lengthIs3.or(startWithA)).collect(Collectors.toList());

		System.out.println(collect);
	}

}
