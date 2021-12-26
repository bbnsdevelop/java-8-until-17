package br.com.bbnsdevelop.interfaces.predicates.joins;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNegate {

	public static void main(String[] args) {

		Predicate<String> startWithA = x -> x.startsWith("A");

		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

		List<String> collect = list.stream().filter(startWithA.negate()).collect(Collectors.toList());

		System.out.println(collect);

	}

}
