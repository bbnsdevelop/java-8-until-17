package br.com.bbnsdevelop.oop.polymorphism.override;

public class PassengerDemo {
	
		
	public static void main(String[] args) {
		
		Passenger p1 = new Passenger(134, "Jhon", "Snow");
		Passenger p2 = new Passenger(134, "Jhon", "Snow");
		
		
		System.out.println(p1.equals(p2));
		
	}

}
