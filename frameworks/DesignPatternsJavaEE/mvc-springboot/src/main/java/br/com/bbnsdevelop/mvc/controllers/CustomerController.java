package br.com.bbnsdevelop.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bbnsdevelop.mvc.model.Customer;

@Controller
public class CustomerController {
	
	
	
	@RequestMapping("/customer")
	public String hello(ModelMap modelMap) {
		
		Customer customer = new Customer(1, "Bob");
		
		modelMap.addAttribute("customer", customer);
		
		return "customer";
	}
	
	

}
