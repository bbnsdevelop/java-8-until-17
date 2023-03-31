package br.com.bbnsdevelop.dataaccessdao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.dataaccessdao.dao.IStudentDao;
import br.com.bbnsdevelop.dataaccessdao.entity.Student;

@RestController
@RequestMapping("/studenties")
public class StudentController {
	
	
	@Autowired
	private IStudentDao dao;
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllEmployee(){
		return ResponseEntity.status(HttpStatus.OK).body(dao.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> create(@PathVariable("id") int id){
		dao.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Student deleted with sucess");
	}

}
