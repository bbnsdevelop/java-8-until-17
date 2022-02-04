package br.com.bbnsdevelop.sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.sb.model.entities.Product;
import br.com.bbnsdevelop.sb.model.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	public Product save(@RequestParam(name = "name") String name) {
		Product p = new Product(name);
		productRepository.save(p);
		return p;
	}

}
