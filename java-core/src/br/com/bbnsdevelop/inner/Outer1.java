package br.com.bbnsdevelop.inner;

public class Outer1 {
	
	void f1() {
		System.out.println("Outer classes non static method");
	}
	

	class Inner{
		void f2() {
			System.out.println("Inner class non static method");
		}
	}
	
	public static void main(String[] args) {
		
		Outer1 outer = new Outer1();
		outer.f1();
		
		Outer1.Inner inner = outer.new Inner();
		inner.f2();
		
		
	}
}
