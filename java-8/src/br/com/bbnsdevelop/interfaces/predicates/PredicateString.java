package br.com.bbnsdevelop.interfaces.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateString {
	
	public static void main(String[] args) {
		
		Predicate<String> p = word -> word.length() > 5;
		
		List<String> words = Arrays.asList("Tomato", "Beans", "Eggs", "Rice", "computer", "Laptop");
		
		System.out.println(p.test(words.get(0)));
		System.out.println(p.test(words.get(1)));
		System.out.println(p.test(words.get(2)));
		
		List<String> wordsFilter = words.stream().filter(p).collect(Collectors.toList());
		
		System.out.println(wordsFilter);
		
		
		
		
	}

}
