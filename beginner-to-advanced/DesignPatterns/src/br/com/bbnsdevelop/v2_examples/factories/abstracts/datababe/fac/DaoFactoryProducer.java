package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.fac;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.DaoType;

public class DaoFactoryProducer {

	public static DaoAbstractFactory produce(DaoType type) {
		DaoAbstractFactory daf = null;

		if (type.equals(DaoType.XML)) {
			daf = new XMLDaoFactory();
		} else if (type.equals(DaoType.DB)) {
			daf = new DBDaoFactory();
		}

		return daf;

	}

}
