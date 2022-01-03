package br.com.bbnsdevelop.stream.newMethods;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.services.product.CategoryTypes;
import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class TakeWhile {
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		Predicate<Product> predicate = p -> p.getCategory().equals(CategoryTypes.HOMEAPPLIANCE);
		Consumer<Product> consumer = p -> System.out.println(p);		
		
		List<Product> list = service.getProducts().stream().filter(predicate).collect(Collectors.toList());
		list.forEach(consumer);
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("The method TakeWile will stop when get the first element is different of predicate");
		List<Product> list2 = service.getProducts().stream().takeWhile(predicate).collect(Collectors.toList());		
		list2.forEach(consumer);
		
		
	}

}
