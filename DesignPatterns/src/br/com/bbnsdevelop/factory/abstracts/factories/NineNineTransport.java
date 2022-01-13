package br.com.bbnsdevelop.factory.abstracts.factories;

import br.com.bbnsdevelop.factory.abstracts.aircrafts.Helicopter;
import br.com.bbnsdevelop.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.factory.abstracts.landvehicles.ILandVehicle;
import br.com.bbnsdevelop.factory.abstracts.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Motorcycle();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Helicopter();
	}

}
