package br.com.bbnsdevelop.varargs;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Varargs v = new Varargs();
		
		List<String> list1 = Arrays.asList("one", "two");
		List<String> list2 = Arrays.asList("three", "four");
		
		// use this when you don't know how many params you want
		String one = v.firstOfFirst(list1, list2);
		
		System.out.println(one);
	}

}
