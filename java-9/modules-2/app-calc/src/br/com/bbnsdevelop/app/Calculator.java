package br.com.bbnsdevelop.app;

import br.com.bbnsdevelop.app.calc.Operations;
import br.com.bbnsdevelop.logger.Logger;

public class Calculator {
	
	private Operations opration = new Operations();

	public Double sum(Double... numbers) {
		Logger.info("sum...");
		return opration.sum(numbers);
	}
	
	
	

}
