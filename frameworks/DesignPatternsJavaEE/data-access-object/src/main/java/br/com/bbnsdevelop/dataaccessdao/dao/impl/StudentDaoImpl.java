package br.com.bbnsdevelop.dataaccessdao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.dataaccessdao.dao.IStudentDao;
import br.com.bbnsdevelop.dataaccessdao.dao.queries.StudentQuery;
import br.com.bbnsdevelop.dataaccessdao.entity.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private StudentQuery query;

	@Override
	public void deleteById(int id) {
		jdbcTemplate.update(query.deleteStudent(), id);

	}

	@Override
	public List<Student> findAll() {
		List<Student> list = jdbcTemplate.query(query.selectAllEmployee(), new BeanPropertyRowMapper(Student.class));

		return list;
	}

}
