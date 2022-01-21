package br.com.bbnsdevelop.dataaccessdao.dao.queries;

import org.springframework.stereotype.Component;

@Component
public class StudentQuery {

	public String deleteStudent() {

		StringBuilder sb = new StringBuilder();

		sb.append("DELETE student ");
		sb.append("WHERE id = ?");
		return sb.toString();
		
	}
	
	
	public String selectAllEmployee() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, name, score FROM student ");		
		return sb.toString();
	}

}
