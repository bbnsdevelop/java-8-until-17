package br.com.bbnsdevelop.lambdas.basic;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		
		Supplier<List<Product>> list = () -> service.getProducts();
		
		Consumer<Product> consumer = p -> System.out.println(p);
		list.get().forEach(consumer);
	}

}
