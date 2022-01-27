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
		
		System.out.println("-".repeat(50));
		
		
		BoxGeneric box = new BoxGeneric();
		box.save(222222222L);
		Long l = (Long) box.open();
		System.out.println(l);
		
		
		BoxGeneric<String> box1 = new BoxGeneric<>();
		box1.save("good practice");
		String text = box1.open();
		System.out.println(text);

		
		
		BoxGeneric<Double> box2 = new BoxGeneric<>();
		box2.save(3.1415);
		Double pi = box2.open();
		System.out.println(pi);
	}
}
