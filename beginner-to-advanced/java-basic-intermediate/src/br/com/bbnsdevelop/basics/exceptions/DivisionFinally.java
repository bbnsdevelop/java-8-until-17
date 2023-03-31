package br.com.bbnsdevelop.basics.exceptions;

public class DivisionFinally {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Zero can't be a divisor");
		}finally {
			System.out.println("Here will happen regardless of the exception or not ");
		}
		
		System.out.println("continue, because catch get a Exception");

	}

}
