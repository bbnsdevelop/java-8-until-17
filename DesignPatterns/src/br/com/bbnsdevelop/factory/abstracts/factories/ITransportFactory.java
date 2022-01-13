package br.com.bbnsdevelop.factory.abstracts.factories;

import br.com.bbnsdevelop.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.factory.abstracts.landvehicles.ILandVehicle;

public interface ITransportFactory {
	
	ILandVehicle createTransportVehicle();
	IAircraft createTransportAircraft();

}
