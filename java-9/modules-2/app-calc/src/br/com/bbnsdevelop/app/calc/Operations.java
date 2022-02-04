package br.com.bbnsdevelop.app.calc;

import java.util.Arrays;

public class Operations {
	
	public Double sum(Double... numbers) {
		return Arrays.stream(numbers).reduce(0.0, (total, n) -> total + n);
	}

}
