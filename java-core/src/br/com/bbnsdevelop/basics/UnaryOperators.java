package br.com.bbnsdevelop.basics;

public class UnaryOperators {

	public static void main(String[] args) {

		int i = 10;
		int a = i++;
		
		System.out.println(i);
		System.out.println(a);
		
		
		boolean tet = false || true;
		int b = 5&6;
		System.out.println(b);
		System.out.println(tet);
		
		BMICalculator();
	}
	
	
	public static void BMICalculator() {
		
		double height = 6.2;
		double weight = 93;
		double heightInMeters = height * 0.4536;
		double bmi = weight / (heightInMeters * heightInMeters);
		
		System.out.println("BMI: " + bmi);
		
	}

}
