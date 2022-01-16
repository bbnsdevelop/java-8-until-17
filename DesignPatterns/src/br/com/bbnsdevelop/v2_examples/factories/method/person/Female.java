package br.com.bbnsdevelop.v2_examples.factories.method.person;

public class Female implements IPerson {

	@Override
	public void wish(String msg) {
		System.out.println("Female: ".concat(msg));

	}

}
