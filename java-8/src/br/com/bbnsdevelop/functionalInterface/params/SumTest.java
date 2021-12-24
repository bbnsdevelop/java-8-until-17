package br.com.bbnsdevelop.functionalInterface.params;

public class SumTest {

	
	public static void main(String[] args) {
		
		Sum s = (a, b) -> System.out.println("Sum is: "+ (a + b));
		
		s.calc(3, 5);
	}
}
