package br.com.bbnsdevelop.oop.abstracts.finalsclass;

public class Test {

	public static void main(String[] args) {
		final A a1 = new A();
		
		// here has error because the variable (pi) is final, can't modify their value
		
		// a1.pi = 1.4f; 
		
		// here has error because the object a1 is final, can't modify their value
		// a1 = new A(); 
		
		System.out.println(a1.pi);
		
		B b1 = new B();
		
		b1.age = 30;
		b1.age = 20;
		
		System.out.println(b1.age);
		
		b1 = new B();
		
		
		System.out.println(b1.age);
		
	}

}
