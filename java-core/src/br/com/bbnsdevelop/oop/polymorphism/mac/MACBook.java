package br.com.bbnsdevelop.oop.polymorphism.mac;

import br.com.bbnsdevelop.oop.polymorphism.interfaces.AppleLaptop;

public abstract class MACBook implements AppleLaptop {
	
	@Override
	public void start() {
		System.out.println("Inside macbook method start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside macbook method shutdown");
	}
	
	public void screen() {
		System.out.println("show screen");
	}
	

}
