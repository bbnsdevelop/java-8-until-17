package br.com.bbnsdevelop.v1_examples.factory.abstracts.factories;

import br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts.IAircraft;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.boats.IBoat;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles.ILandVehicle;

public interface ITransportFactory {
	
	ILandVehicle createTransportVehicle();
	IAircraft createTransportAircraft();
	IBoat createTransportBoat();

}
