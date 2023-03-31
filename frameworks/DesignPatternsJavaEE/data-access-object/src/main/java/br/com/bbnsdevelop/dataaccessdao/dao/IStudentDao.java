package br.com.bbnsdevelop.dataaccessdao.dao;

import java.util.List;

import br.com.bbnsdevelop.dataaccessdao.entity.Student;

public interface IStudentDao {
	
	void deleteById(int id);
	List<Student> findAll();

}
