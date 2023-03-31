package br.com.bbnsdevelop.generics.utils;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<String> langs = List.of("Java", "PHP", "JavaScript", "C/C++");
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,0);
		
		String lastLang = (String) ListUtils.getLast1(langs);
		System.out.println(lastLang);
		
		Integer number = (Integer) ListUtils.getLast1(numbers);
		System.out.println(number);
		
		System.out.println("-".repeat(50));

		
		String last2 = ListUtils.getLast2(langs);
		System.out.println(last2);
		
		Integer last22 = ListUtils.getLast2(numbers);
		System.out.println(last22);
	}

}
