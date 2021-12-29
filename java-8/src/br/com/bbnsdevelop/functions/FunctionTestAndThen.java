package br.com.bbnsdevelop.functions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class FunctionTestAndThen {

	public static void main(String[] args) {
		ProductService service = new ProductService();

		Function<List<Product>, List<Product>> productGreaterThan10 = p -> service.listProductQuantityGreaterThan10();
		
		Function<List<Product>, List<Product>> productComputing = p -> service.listProductCategoryComputing(p);

	
		
		System.out.println("And Then");
		
		List<Product> list = productGreaterThan10.andThen(productComputing).apply(service.getProducts());
		
		Consumer<Product> consumer = p -> System.out.println(p);		
		list.forEach(consumer);
		
	}

}
