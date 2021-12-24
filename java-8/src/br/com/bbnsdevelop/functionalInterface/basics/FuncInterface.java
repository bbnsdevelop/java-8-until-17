package br.com.bbnsdevelop.functionalInterface.basics;

@FunctionalInterface
public interface FuncInterface {
	
	void myMethod();
	
	// If you declare another method. Here has error because doesn't functional interface
	// void myMethod1();

}
