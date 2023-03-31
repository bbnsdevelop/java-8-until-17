package br.com.bbnsdevelop.dataaccessdao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.dataaccessdao.dao.IEmployeeDao;
import br.com.bbnsdevelop.dataaccessdao.entity.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
	@Autowired
	private IEmployeeDao dao;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee(){
		return ResponseEntity.status(HttpStatus.OK).body(dao.findAllEmployee());
	}
	
	@PostMapping
	public ResponseEntity<String> create(@RequestBody Employee employee){
		dao.create(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee created");
	}

}
