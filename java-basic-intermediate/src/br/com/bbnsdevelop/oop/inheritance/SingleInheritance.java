package br.com.bbnsdevelop.oop.inheritance;

public class SingleInheritance { //<-- here extends implicit the class Object
	
	
	void method1() {
		System.out.println("Inside m1");
	}
	
	
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.method1();
		s.hashCode();
		s.getClass();
		
	}

}
