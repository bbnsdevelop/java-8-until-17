package br.com.bbnsdevelop.functionalInterface;

public class Test {
	
	
	public static void main(String[] args) {
		// FuncInterface i = new OldWayToImplementationInterface();		
		// i.myMethod();
		
		FuncInterface i = ()-> System.out.println("Newest Way To Implementation functional Interface");
		i.myMethod();
	}

}
