package br.com.bbnsdevelop.sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	

	@GetMapping("/hello")
	public String hello() {
		return "Hello world spring boot";
	}
}
