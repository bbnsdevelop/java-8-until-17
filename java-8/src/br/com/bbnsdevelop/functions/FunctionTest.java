package br.com.bbnsdevelop.functions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		
		String name = "John";
		
		Integer length = f.apply(name);
		System.out.println(length);
	}

}
