package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.fac;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.Dao;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.DaoType;

public abstract class DaoAbstractFactory {
		
	public abstract Dao createDao(DaoType type);

}
