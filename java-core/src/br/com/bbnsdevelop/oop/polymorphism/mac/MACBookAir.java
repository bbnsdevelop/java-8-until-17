package br.com.bbnsdevelop.oop.polymorphism.mac;

public class MACBookAir extends MACBook {
	
	@Override
	void start() {
		System.out.println("Inside MACBookAir");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MACBookAir");
	}

}
