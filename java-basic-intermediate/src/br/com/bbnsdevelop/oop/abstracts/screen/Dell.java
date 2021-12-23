package br.com.bbnsdevelop.oop.abstracts.screen;

public abstract class Dell implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("inside scroll DELL");
	}
}
