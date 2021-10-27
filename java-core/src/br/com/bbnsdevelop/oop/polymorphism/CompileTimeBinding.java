package br.com.bbnsdevelop.oop.polymorphism;

public class CompileTimeBinding {
	
	public static void main(String[] args) {
		
		CompileTimeBinding c = new CompileTimeBinding();
		
		c.add(1, 3);
		c.add(1.5f, 8.9f);
		c.add(1f, 3f, 6f);
		
	}
	
	
	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is: " + result);
		
	}
	
	void add(float a, float b) {
		float result = a + b;
		System.out.println("Result is: " + result);
		
	}
	
	void add(float a, float b, float c) {
		float result = a + b + c;
		System.out.println("Result is: " + result);
		
	}

}
