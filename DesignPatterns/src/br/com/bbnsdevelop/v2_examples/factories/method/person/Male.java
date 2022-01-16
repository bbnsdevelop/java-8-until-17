package br.com.bbnsdevelop.v2_examples.factories.method.person;

public class Male implements IPerson {

	@Override
	public void wish(String msg) {
		System.out.println("Male: ".concat(msg));

	}

}
