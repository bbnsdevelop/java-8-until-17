package br.com.bbnsdevelop.sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
	
	
	@GetMapping("/sum/{a}/{b}")
	public Integer sum(@PathVariable("a") Integer num1, @PathVariable("b") Integer num2) {
		Integer sum = num1 + num2;
		return sum;
	}
	
	@GetMapping("/subtract")
	public Integer subtract(@RequestParam(name ="a", required = true) Integer num1, @RequestParam(name ="b", required = true) Integer num2) {
		Integer subtract = num1 - num2;
		return subtract;
	}

}
