package br.com.bbnsdevelop.factory.abstracts.factories;

import br.com.bbnsdevelop.factory.abstracts.aircrafts.Airplane;
import br.com.bbnsdevelop.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.factory.abstracts.boats.Boat;
import br.com.bbnsdevelop.factory.abstracts.boats.IBoat;
import br.com.bbnsdevelop.factory.abstracts.landvehicles.Car;
import br.com.bbnsdevelop.factory.abstracts.landvehicles.ILandVehicle;

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
