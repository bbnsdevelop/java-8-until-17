package br.com.bbnsdevelop.dataaccessdao.dao;

import java.util.List;

import br.com.bbnsdevelop.dataaccessdao.entity.Employee;

public interface IEmployeeDao {
	
	void create(Employee employee);
	List<Employee> findAllEmployee();
}
