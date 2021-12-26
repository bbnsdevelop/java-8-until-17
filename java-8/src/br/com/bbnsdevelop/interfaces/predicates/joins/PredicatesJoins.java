package br.com.bbnsdevelop.interfaces.predicates.joins;

import java.util.function.Predicate;

public class PredicatesJoins {

	public static void main(String[] args) {
		int[] x = { 0, 7, 10, 20, 30, 40, 50, 60, 70, 77 };
		
		Predicate<Integer> p1 = n -> n > 10;
		Predicate<Integer> p2 = n -> n % 2 == 0;
		
		
		
		System.out.println("Greater than 10:");
		methodWithPredicateParam(p1, x);
		
		System.out.println("Even Numbers: ");
		methodWithPredicateParam(p2, x);
		
		System.out.println("Not greater than 10: ");
		methodWithPredicateParam(p1.negate(), x);
		
		
		System.out.println("Greater than 10 AND Even: ");
		methodWithPredicateParam(p1.and(p2), x);
	
	}
	
	
	static void methodWithPredicateParam(Predicate<Integer> p, int[] x) {
		
		for (int number : x) {
			if(p.test(number)) {
				System.out.println(number);
			}			
		}
		
	}

}
