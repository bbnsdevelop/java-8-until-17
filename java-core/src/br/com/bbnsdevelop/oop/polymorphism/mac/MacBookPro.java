package br.com.bbnsdevelop.oop.polymorphism.mac;

public class MacBookPro extends MACBook {

	@Override
	void start() {
		System.out.println("Inside macbookpro method start");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside macbookpro method shutdown");
	}

}
