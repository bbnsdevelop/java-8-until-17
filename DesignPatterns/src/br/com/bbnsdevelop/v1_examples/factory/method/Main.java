package br.com.bbnsdevelop.v1_examples.factory.method;

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
