package br.com.bbnsdevelop.streams;

import java.util.Comparator;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class MinAndMax {
	
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		System.out.println("----------------------------without-comparator-----------------------------------------------------");
		Comparator<Product> com = (p1,p2) -> p1.getPrice().compareTo(p2.getPrice()); 
		
		Product product = service.getProducts().stream().max(com).get();
		
		
		System.out.println("Max price: " + product);
		
		product = service.getProducts().stream().min(com).get();
		
		System.out.println("Min price: " + product);
	}

}