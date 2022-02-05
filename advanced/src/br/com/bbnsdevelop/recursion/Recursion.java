package br.com.bbnsdevelop.recursion;

public class Recursion {
	
	public static void main(String[] args) {
		System.out.println(factotialFor(3));
		
		System.out.println("-".repeat(50));
		System.out.println(factotialRecursion(3));
	}
	
	private static int factotialFor(int number) {
		int factotial = 1;
		
		for (int i = 1; i <= number; i++) {
			factotial = factotial * i;
			
		}
		return factotial;
		
	}

	
	private static int factotialRecursion(int number) {
		if(number <= 1) {
			return 1;
		}		
		return number * factotialRecursion(number -1);
	}
}
