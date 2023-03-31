package br.com.bbnsdevelop.v1_examples.factory.abstracts.app;

import br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.boats.IBoat;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.factories.ITransportFactory;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles.ILandVehicle;

public class Application {
	
	private ILandVehicle vehicle;
	private IAircraft aircraft;
	private IBoat boat;
	
	public Application(ITransportFactory factory) {
		vehicle = factory.createTransportVehicle();
		aircraft = factory.createTransportAircraft();
		boat = factory.createTransportBoat();
	};
	
	
	public void startRoute() {
		vehicle.startRoute();
		aircraft.startRoute();
		boat.startRoute();
	}

}
