package br.com.bbnsdevelop.safevarargs;

import java.util.List;

public class SafeVarargsDemo {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("abc", "dfg");
		List<String> list2 = List.of("hij", "lmn");
		SafeVarargsDemo.myMethod(list, list2);
	}
	
	@SafeVarargs
	public static void myMethod(List<String> ...l) {
				
		String name = (String) l[0].get(0);
		
		System.out.println(name);
	}

}
