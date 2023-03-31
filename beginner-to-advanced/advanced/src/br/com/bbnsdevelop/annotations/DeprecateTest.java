package br.com.bbnsdevelop.annotations;

public class DeprecateTest {
	
	public static void main(String[] args) {
		DeprecatedMethod d = new DeprecatedMethod();
		
		// not warning
		d.method1();
		d.name = "John";
		
		d.method2();
		
		DeprecateClass dprecatedClass = new DeprecateClass();
		
		dprecatedClass.test();
	}

}
