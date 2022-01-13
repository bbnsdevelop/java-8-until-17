package br.com.bbnsdevelop.factory.abstracts;

import br.com.bbnsdevelop.factory.abstracts.app.Application;
import br.com.bbnsdevelop.factory.abstracts.factories.ITransportFactory;
import br.com.bbnsdevelop.factory.abstracts.factories.NineNineTransport;
import br.com.bbnsdevelop.factory.abstracts.factories.UberTransport;

public class Main {
	
	public static void main(String[] args) {
		Application app = configureApplication("99");
		app.startRoute();
	}
	
	
	public static Application configureApplication(String company) {
		
		Application app;
		ITransportFactory factory;
		
		if(company.equals("Uber")) {
			factory = new UberTransport();
		}else {
			factory = new NineNineTransport();
		}
		app = new Application(factory);
		return app;
	}

}
