package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.xml;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.Dao;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving employee to XML");
	}

}
