package br.com.bbnsdevelop.oop.polymorphism.overloading;

public class AutomaticPromotion {
	
	/*
	public void print(int version) {
		System.out.println("Integer version: " + version);
	}*/
	
	public void print(float version) {
		System.out.println("Float version: " + version);
	}

	public static void main(String[] args) {
		AutomaticPromotion a = new AutomaticPromotion();
		a.print(123);
		a.print(1893.09f);
		
	}
}
