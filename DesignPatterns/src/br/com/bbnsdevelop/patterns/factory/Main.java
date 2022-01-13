package br.com.bbnsdevelop.patterns.factory;

import br.com.bbnsdevelop.patterns.factory.method.BicycleTransport;
import br.com.bbnsdevelop.patterns.factory.method.CarTransport;
import br.com.bbnsdevelop.patterns.factory.method.MotorcycleTransport;
import br.com.bbnsdevelop.patterns.factory.method.Transport;

public class Main {

	private static Transport transport;

	public static void main(String[] args) {
		String typeVehicle = "Uber";

		configure(typeVehicle);
		if (transport != null) {
			runTransport();
		}
		
		System.out.println("-".repeat(50));
		typeVehicle = "UberEats";
		configure(typeVehicle);
		if (transport != null) {
			runTransport();
		}
		
		
		System.out.println("-".repeat(50));
		typeVehicle = "smallPaths";
		configure(typeVehicle);
		if (transport != null) {
			runTransport();
		}

	}

	private static void runTransport() {
		transport.startTransport();
	}

	private static void configure(String typeVehicle) {
		transport = switch (typeVehicle) {
		case "Uber" -> new CarTransport();
		case "UberEats" -> new MotorcycleTransport();
		case "smallPaths" -> new BicycleTransport();

		default -> throw new IllegalArgumentException("You need choose one option!");
		};
	}

}
