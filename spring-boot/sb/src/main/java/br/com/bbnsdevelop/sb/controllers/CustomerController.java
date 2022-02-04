package br.com.bbnsdevelop.sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.sb.models.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping
	public Customer getCustomer() {
		return new Customer(1, "John", "123456789");
	}

}
