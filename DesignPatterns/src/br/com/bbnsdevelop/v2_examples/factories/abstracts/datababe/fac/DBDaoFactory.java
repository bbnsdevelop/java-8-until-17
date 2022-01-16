package br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.fac;

import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.Dao;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.DaoType;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.db.DBDeptDao;
import br.com.bbnsdevelop.v2_examples.factories.abstracts.datababe.db.DBEmpDao;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(DaoType type) {
		Dao dao = null;
		if (type.equals(DaoType.DB_EMP)) {
			dao = new DBEmpDao();
		} else if (type.equals(DaoType.DB_DEPT)) {
			dao = new DBDeptDao();
		}
		return dao;
	}

}
