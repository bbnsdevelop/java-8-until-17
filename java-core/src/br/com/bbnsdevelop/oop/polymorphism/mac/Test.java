package br.com.bbnsdevelop.oop.polymorphism.mac;

public class Test {

	public static void main(String[] args) {
		MACBook m1 = new MacBookPro();
		MACBook m2 = new MACBookAir();
		
		m1.start();
		m1.shutdown();
		m2.start();
		m2.shutdown();

	}

}
