package br.com.bbnsdevelop.lambdas.basic;

import java.util.function.Consumer;

import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class Consumers {
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		Consumer<Product> print = p -> System.out.println(p.getName());
		
		print.accept(service.getProducts().get(0));
		
		System.out.println("------------------------");
		service.getProducts().forEach(print);
	}

}
