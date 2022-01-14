package br.com.bbnsdevelop.builder.builders;

import br.com.bbnsdevelop.builder.components.CarType;
import br.com.bbnsdevelop.builder.components.Engine;
import br.com.bbnsdevelop.builder.components.TransmissionType;

public interface IBuilder {
	
	void setCarType(CarType carType);
	void setSeats(int seats);
	void setTransmissionType(TransmissionType transmissionType);
	void setEngine(Engine engine);

}
