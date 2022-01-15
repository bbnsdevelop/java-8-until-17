package br.com.bbnsdevelop.v1_examples.factory.abstracts;

import br.com.bbnsdevelop.v1_examples.factory.abstracts.app.Application;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.factories.AquaticVoyagers;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.factories.ITransportFactory;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.factories.NineNineTransport;
import br.com.bbnsdevelop.v1_examples.factory.abstracts.factories.UberTransport;

public class Main {
	
	public static void main(String[] args) {
		Application app = configureApplication("Boat");
		app.startRoute();
	}
	
	
	public static Application configureApplication(String company) {
		
		Application app;
		ITransportFactory factory;
		
		if(company.equals("Uber")) {
			factory = new UberTransport();
		}else if(company.equals("99")) {
			factory = new NineNineTransport();
		}else {
			factory = new AquaticVoyagers();
		}
		app = new Application(factory);
		return app;
	}

}
