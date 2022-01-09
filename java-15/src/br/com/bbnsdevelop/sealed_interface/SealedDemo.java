package br.com.bbnsdevelop.sealed_interface;

public class SealedDemo {
	
	public static void main(String[] args) {
		BMWseries three = new ThreeSeries();
		three.myMethod();
		
		three = new FiveSeries();
		
		three.myMethod();
	}
	

}
