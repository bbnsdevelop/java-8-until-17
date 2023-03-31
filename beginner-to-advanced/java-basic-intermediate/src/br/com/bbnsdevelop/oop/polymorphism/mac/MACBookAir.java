package br.com.bbnsdevelop.oop.polymorphism.mac;

public class MACBookAir extends MACBook {
	
	@Override
	public void start() {
		System.out.println("Inside MACBookAir");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MACBookAir");
	}

}
