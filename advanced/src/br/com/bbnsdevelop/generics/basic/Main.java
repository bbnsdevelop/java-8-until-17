package br.com.bbnsdevelop.generics.basic;

public class Main {

	
	public static void main(String[] args) {
		Box boxA = new Box();
		boxA.save(2.3); // autobox  double -> Double, primitive to Wrapper
		
		Double number = (Double) boxA.open();
		System.out.println(number);
		
		Box boxB = new Box();
		boxB.save("Hello");
		
		
		String say = (String) boxB.open();
		System.out.println(say);
		
	}
}
