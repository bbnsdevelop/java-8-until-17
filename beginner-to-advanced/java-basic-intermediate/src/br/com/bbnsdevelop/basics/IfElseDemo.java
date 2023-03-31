package br.com.bbnsdevelop.basics;

public class IfElseDemo {

	public static void main(String[] args) {

		int x = 20, y = 30;

		if (x > y) {
			System.out.println("X is greator");
		} else if (y > x) {
			System.out.println("Y is greator");
		} else {
			System.out.println("Both number are equal");
		}
		
		gradingApplication();
	}
	
	
	public static void gradingApplication() {
		int maths = 87, physics = 50, chemistry = 90;
		
		calculator(maths);
		calculator(physics);
		calculator(chemistry);
	}
	public static void calculator(int average) {
		
		if(average <= 59) {
			System.out.println("C");
		}
		else if(average <= 69) {
			System.out.println("B");	
		}
		else {
			System.out.println("A");	
		}
	}

}
