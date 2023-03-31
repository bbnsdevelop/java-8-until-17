package br.com.bbnsdevelop.v1_examples.solid.Ocp.vehicle;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		TypeVehicle type = TypeVehicle.CAR;
		
		
		if(type.equals(TypeVehicle.CAR)) {
			Car car = new Car("Read", "2022", 2.0, 4);
			car.configure();
		}else {
			Motorcycle motorcycle = new Motorcycle("Black", "2020", 250.0);
			motorcycle.configure();
		}
		
	}

}
