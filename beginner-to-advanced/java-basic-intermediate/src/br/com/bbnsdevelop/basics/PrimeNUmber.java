package br.com.bbnsdevelop.basics;

public class PrimeNUmber {

	public static void main(String[] args) {
		boolean primeFlag = true;

		
		int n = 3;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				primeFlag = false;
			}
		}
		
		if(primeFlag) {
			System.out.println("Is prime");	
		}
		else {
			System.out.println("No prime");
		}

	}

}
