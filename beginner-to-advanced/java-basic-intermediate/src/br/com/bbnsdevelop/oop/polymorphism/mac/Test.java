package br.com.bbnsdevelop.oop.polymorphism.mac;

public class Test {

	public static void main(String[] args) {
		MACBook m1 = new MacBookPro();
		MACBook m2 = new MACBookAir();
		
		m1.start();
		m1.shutdown();
		m1.screen();
		
		
		m2.start();
		m2.shutdown();
		
		
		MacBookPro m3 = (MacBookPro) m1; // Casting
		MACBookAir m4 = (MACBookAir) m2; // Casting
		
		m3.start();
		m3.shutdown();

		// here has error, because the type is MACBook
		// m1.process();
		// but here has a sucessully because the object is MacBookPro
		m3.process();
		
		
		m4.start();
		m4.shutdown();

	}

}
