package br.com.bbnsdevelop.dataaccessdao.dao.queries;

import org.springframework.stereotype.Component;

@Component
public class EmployeeQuery {

	public String insertEmployee() {
		StringBuilder sb = new StringBuilder();

		sb.append("INSERT INTO employee ");
		sb.append("VALUES (?,?) ");
		return sb.toString();
	}

	public String selectAllEmployee() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, name FROM employee ");		
		return sb.toString();
	}

}
