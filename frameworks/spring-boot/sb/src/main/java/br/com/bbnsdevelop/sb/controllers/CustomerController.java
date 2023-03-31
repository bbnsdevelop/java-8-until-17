package br.com.bbnsdevelop.sb.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.sb.model.entities.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/any")
	public Customer getCustomer() {
		return new Customer(1, "John", "123456789");
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer1(@PathVariable("id") Integer id) {
		return new Customer(id, "John", "123456789");
	}
	
	
	@GetMapping
	public Customer getCustomer2(@RequestParam(name = "id", required = true) Integer id) {
		return new Customer(id, "John", "123456789");
	}

}
