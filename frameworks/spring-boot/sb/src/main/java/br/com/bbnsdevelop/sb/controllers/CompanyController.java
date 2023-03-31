package br.com.bbnsdevelop.sb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.sb.model.entities.Company;
import br.com.bbnsdevelop.sb.services.CompanyService;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	
	
	@Autowired
	private CompanyService service;
	
	@GetMapping
	public ResponseEntity<List<Company>> getAll(){
		
		List<Company> list = service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

}
