package br.com.bbnsdevelop.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class FilterPredicate {
	
	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		
	
		Predicate<Product> predicate = p -> p.getQuantity() >= 15;
	
		
		List<Product> list = service.getProducts().stream().filter(predicate).collect(Collectors.toList());
		
		Consumer<Product> consumer = p -> System.out.println(p);
		list.forEach(consumer);
	}

}
