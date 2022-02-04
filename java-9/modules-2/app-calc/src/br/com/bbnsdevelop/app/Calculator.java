package br.com.bbnsdevelop.app;

import br.com.bbnsdevelop.app.calc.Operations;

public class Calculator {
	
	private Operations opration = new Operations();

	public Double sum(Double... numbers) {
		return opration.sum(numbers);
	}
	
	
	

}
