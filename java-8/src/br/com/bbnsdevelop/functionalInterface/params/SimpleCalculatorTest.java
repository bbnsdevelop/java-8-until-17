package br.com.bbnsdevelop.functionalInterface.params;

public class SimpleCalculatorTest {

	public static void main(String[] args) {
		SimpleCalculator c = (a, b) -> a + b;		
		System.out.println("addition is: " + c.calc(8, 5));
				
		c = (a, b) -> a - b;		
		int result = c.calc(100, 5);
		System.out.println("subtraction is: " + result);
		
		
		c = (a, b) -> a * b;		
		System.out.println("multiplication is: " + c.calc(10, 5));
		
		
		c = (a, b) -> a / b;		
		System.out.println("division is: " + c.calc(30, 5));
		
		
	}
}
