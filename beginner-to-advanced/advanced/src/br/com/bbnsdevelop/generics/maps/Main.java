package br.com.bbnsdevelop.generics.maps;

public class Main {
	
	public static void main(String[] args) {
		
		Pairs<Integer, String> result = new Pairs<>();
		
		result.add(1, "John");
		result.add(2, "Albert");
		result.add(3, "Tesla");
		result.add(4, "Max");
		result.add(5, "Ana");
		result.add(6, "Clare");
		result.add(1, "John Snow");
		
		
		System.out.println(result.getValue(1));
		
		
		System.out.println(result.getValue(3));
		
	}

}
