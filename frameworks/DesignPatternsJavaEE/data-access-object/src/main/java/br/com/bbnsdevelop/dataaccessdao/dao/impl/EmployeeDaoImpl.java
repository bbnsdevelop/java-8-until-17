package br.com.bbnsdevelop.dataaccessdao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.dataaccessdao.dao.IEmployeeDao;
import br.com.bbnsdevelop.dataaccessdao.dao.queries.EmployeeQuery;
import br.com.bbnsdevelop.dataaccessdao.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeQuery query;

	@Override
	public void create(Employee employee) {

		jdbcTemplate.update(query.insertEmployee(), employee.getId(), employee.getName());
	}
	
	
	@Override
	public List<Employee> findAllEmployee(){
		
		List<Employee> list = jdbcTemplate.query(query.selectAllEmployee(), new BeanPropertyRowMapper(Employee.class));
		
		return list;
	}
	
	

}
