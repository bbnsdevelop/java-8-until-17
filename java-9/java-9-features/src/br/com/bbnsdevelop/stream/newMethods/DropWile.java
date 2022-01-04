package br.com.bbnsdevelop.stream.newMethods;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.services.product.CategoryTypes;
import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class DropWile {

	public static void main(String[] args) {

		ProductService service = new ProductService();

		Predicate<Product> predicate = p -> p.getCategory().equals(CategoryTypes.HOMEAPPLIANCE);
		Consumer<Product> consumer = p -> System.out.println(p);

		service.getProducts().forEach(consumer);

		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("");

		System.out.println("The method dropWhile will drop all elements matching predicate, and return a list with the other elements");
		List<Product> list2 = service.getProducts().stream().dropWhile(predicate).collect(Collectors.toList());
		list2.forEach(consumer);
	}

}
