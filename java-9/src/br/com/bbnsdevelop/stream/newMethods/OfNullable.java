package br.com.bbnsdevelop.stream.newMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class OfNullable {
	
	public static void main(String[] args) {
		
		
		ProductService service = new ProductService();

		Consumer<Product> consumer = p -> System.out.println(p);

		List<Product> products = new ArrayList<>(service.getProducts());
		products.add(null);
		products.add(null);
		products.add(null);
		products.add(null);
		products.forEach(consumer);

		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("");
		

		System.out.println("The method Stream.ofNullable will remove all elements is null, and return a list with the other elements");
		List<Product> list2 = products.stream().flatMap(p -> Stream.ofNullable(p)).collect(Collectors.toList());
		list2.forEach(consumer);
	}

}
