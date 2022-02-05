package br.com.bbnsdevelop.sb.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.sb.model.entities.Product;
import br.com.bbnsdevelop.sb.model.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private static final int MAX_ITEM = 50;
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
	
	@GetMapping("/page")
	public Iterable<Product> getProducts(@RequestParam("number") Integer number, @RequestParam("quantity") Integer quantity ){
		quantity = quantity > MAX_ITEM ? MAX_ITEM : quantity;
		Pageable pageable = PageRequest.of(number, quantity);
				
		return productRepository.findAll(pageable);
	}

	@GetMapping("/{id}")
	public Product getById(@PathVariable("id") Long id ) {
		return productRepository.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable("id") Long id, @RequestBody @Valid Product product ) throws NotFoundException {
		
		productRepository.findById(id).orElseThrow(NotFoundException::new);		
		product.setId(id);
		return productRepository.save(product);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Long id ) {
		productRepository.deleteById(id);
	}

}
