package br.com.bbnsdevelop.oop.abstracts.screen;

public abstract class HP implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("inside scroll HP");
	}

}
