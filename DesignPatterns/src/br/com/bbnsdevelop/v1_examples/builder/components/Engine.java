package br.com.bbnsdevelop.v1_examples.builder.components;

public class Engine {
	
	private int power;

	public Engine(int power) {
		this.power = power;
	}
	
	public int getPower() {
		return power;
				
	}

	@Override
	public String toString() {
		return "power: " + power;
	}
	
	
	
	
	

}
