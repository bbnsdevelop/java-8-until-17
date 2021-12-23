package br.com.bbnsdevelop.basics;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");

	}
	
	static {
		System.out.println("Will start first here then main method, becauuse here is static block");
	}
	
	static {
		System.out.println("Block 2 -  Will start first here then main method, becauuse here is static block");
	}

}
