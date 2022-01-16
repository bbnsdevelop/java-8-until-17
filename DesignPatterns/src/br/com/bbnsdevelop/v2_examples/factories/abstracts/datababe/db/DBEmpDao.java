package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.db;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.Dao;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving employee to DB");
	}

}
