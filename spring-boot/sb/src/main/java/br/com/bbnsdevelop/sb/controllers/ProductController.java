package br.com.bbnsdevelop.sb.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.sb.model.entities.Product;
import br.com.bbnsdevelop.sb.model.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	public Product save(@RequestBody @Valid Product p) {		
		productRepository.save(p);
		return p;
	}
	
	@GetMapping
	public List<Product> getAll(){
		Iterable<Product> all = productRepository.findAll();
		List<Product> products = new ArrayList<>();
		all.forEach(products::add);
		return products;
	}
	

}
