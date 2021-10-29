package br.com.bbnsdevelop.oop.polymorphism.mac;

public class MacBookPro extends MACBook {

	@Override
	public void start() {
		System.out.println("Inside macbookpro method start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside macbookpro method shutdown");
	}

	
	public void process() {
		System.out.println("Inside macbookpro method process");
	}
}
