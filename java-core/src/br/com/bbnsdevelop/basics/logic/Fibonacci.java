package br.com.bbnsdevelop.basics.logic;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		
		int terms = 20;
		
		int n1 = 0;
		int n2 = 1;
		
		for(int elements = terms; elements > 0; elements --) {
			System.out.print(n1+" ");
			int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
		}
	}
	
}
