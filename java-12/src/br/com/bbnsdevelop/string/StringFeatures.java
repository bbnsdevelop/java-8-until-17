package br.com.bbnsdevelop.string;

public class StringFeatures {
	
	public static void main(String[] args) {
		String str = "All the power is with in you. You can do anything and everything";
		System.out.println(str);
		System.out.println("-".repeat(50));
		System.out.println(str.indent(5));
		
		
		String s1 = "10";
		
		Integer result = s1.transform(Integer::parseInt);
		System.out.println(result instanceof Integer);
		System.out.println(result);
		
	}

}
