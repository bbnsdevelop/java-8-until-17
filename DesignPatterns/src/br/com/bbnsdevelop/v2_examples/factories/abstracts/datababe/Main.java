package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.fac.DaoAbstractFactory;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.fac.DaoFactoryProducer;

public class Main {
	
	public static void main(String[] args) {
		DaoAbstractFactory factory = DaoFactoryProducer.produce(DaoType.DB);		
		Dao dao = factory.createDao(DaoType.DB_EMP);
		dao.save();
		dao = factory.createDao(DaoType.DB_DEPT);
		dao.save();
		
		System.out.println("-".repeat(50));
		
		factory = DaoFactoryProducer.produce(DaoType.XML);
		dao = factory.createDao(DaoType.XML_EMP);
		dao.save();
		dao = factory.createDao(DaoType.XML_DEPT);
		dao.save();
	}

}
