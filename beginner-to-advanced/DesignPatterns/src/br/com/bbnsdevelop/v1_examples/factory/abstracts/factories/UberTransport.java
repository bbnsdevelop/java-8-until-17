package br.com.bbnsdevelop.v1_examples.factory.abstracts.factories;

import br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts.Airplane;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.boats.Boat;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.boats.IBoat;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles.Car;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {		
		return new Car();
	}

	@Override
	public IAircraft createTransportAircraft() {		
		return new Airplane();
	}

	@Override
	public IBoat createTransportBoat() {		
		return new Boat();
	}

}
