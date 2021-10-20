package br.com.bbnsdevelop.oop.inheritance.transports;

public class OverRindingTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.fuel());
		
		Bus b = new Bus();
		System.out.println(b.fuel());
		
		Bike bike = new Bike();
		System.out.println(bike.fuel());

	}

}
