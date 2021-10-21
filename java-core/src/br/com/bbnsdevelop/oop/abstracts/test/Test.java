package br.com.bbnsdevelop.oop.abstracts.test;

import br.com.bbnsdevelop.oop.abstracts.impl.FiveSeries;
import br.com.bbnsdevelop.oop.abstracts.impl.ThreeSeries;

public class Test {

	public static void main(String[] args) {
		ThreeSeries t = new ThreeSeries();		
		FiveSeries f = new FiveSeries();
		
		t.accelerate();
		f.accelerate();
		

	}

}
