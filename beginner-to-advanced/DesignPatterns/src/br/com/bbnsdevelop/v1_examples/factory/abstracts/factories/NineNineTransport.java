package br.com.bbnsdevelop.v1_examples.factory.abstracts.factories;

import br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts.Helicopter;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.boats.Boat;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.boats.IBoat;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles.ILandVehicle;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Motorcycle();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Helicopter();
	}

	@Override
	public IBoat createTransportBoat() {		
		return new Boat();
	}

}
