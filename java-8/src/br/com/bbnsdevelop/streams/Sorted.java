package br.com.bbnsdevelop.streams;

import java.util.Comparator;

import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class Sorted {
	
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		System.out.println("----------------------------without-comparator-----------------------------------------------------");
		Comparator<Product> com = (p1,p2) -> p1.getName().compareTo(p2.getName());		
		service.getProducts().stream().sorted(com).forEach(System.out::println);

		
		
		System.out.println("----------------------------with-comparator-----------------------------------------------------");		
		service.getProductsComparable().stream().sorted().forEach(p ->{System.out.println(p);});
		
		
	}

}
