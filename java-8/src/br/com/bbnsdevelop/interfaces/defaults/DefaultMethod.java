package br.com.bbnsdevelop.interfaces.defaults;

public interface DefaultMethod {
	
	default void method1() {
		System.out.println("method1 - inside interface");
	}

}
