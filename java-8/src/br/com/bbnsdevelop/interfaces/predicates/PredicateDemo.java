package br.com.bbnsdevelop.interfaces.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
	
	
	public static void main(String[] args) {
		 Predicate<Integer> predicateTest =  x -> x > 5;

	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        List<Integer> collect = list.stream().filter(predicateTest).collect(Collectors.toList());

	        System.out.println(collect);
	}

}
