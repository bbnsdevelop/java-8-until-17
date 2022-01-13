package br.com.bbnsdevelop.factory.abstracts.app;

import br.com.bbnsdevelop.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.factory.abstracts.boats.IBoat;
import br.com.bbnsdevelop.factory.abstracts.factories.ITransportFactory;
import br.com.bbnsdevelop.factory.abstracts.landvehicles.ILandVehicle;

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
