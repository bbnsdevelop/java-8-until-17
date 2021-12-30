package br.com.bbnsdevelop.annotations;

public class DeprecatedMethod {
	
	@Deprecated
	public String name;

	public void method1() {
		System.out.println("Inside method1");
	}

	@Deprecated
	public void method2() {
		System.out.println("Inside method2");
	}

}
