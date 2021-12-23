package br.com.bbnsdevelop.basics;

public class StaticVariables {
	
	
	static int num = 10;
	
	
	public static void main(String[] args) {
		// we can use like this
		// is the same below, but there are good practices 
		System.out.println(num);
		
		// for the best practice, we expose a class. Example:
		System.out.println(StaticVariables.num);
	}

}
