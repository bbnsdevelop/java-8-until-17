package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.fac;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.Dao;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.DaoType;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.xml.XMLDeptDao;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.xml.XMLEmpDao;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(DaoType type) {
		Dao dao = null;
		if (type.equals(DaoType.XML_EMP)) {
			dao = new XMLEmpDao();
		} else if (type.equals(DaoType.XML_DEPT)) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
