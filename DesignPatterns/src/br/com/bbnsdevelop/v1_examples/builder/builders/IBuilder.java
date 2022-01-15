package br.com.bbnsdevelop.v1_examples.builder.builders;

import br.com.bbnsdevelop.v1_examples.builder.components.CarType;
import br.com.bbnsdevelop.v1_examples.builder.components.Engine;
import br.com.bbnsdevelop.v1_examples.builder.components.TransmissionType;

public interface IBuilder {
	
	void setCarType(CarType carType);
	void setSeats(int seats);
	void setTransmissionType(TransmissionType transmissionType);
	void setEngine(Engine engine);

}
