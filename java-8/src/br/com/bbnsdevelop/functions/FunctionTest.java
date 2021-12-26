package br.com.bbnsdevelop.functions;

import java.util.List;
import java.util.function.Function;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class FunctionTest {

	public static void main(String[] args) {
		ProductService service = new ProductService();

		Function<String, Integer> f = s -> s.length();

		String name = "John";

		Integer length = f.apply(name);
		System.out.println(length);

		Function<List<Product>, List<Product>> productF = p -> service.listProductQuantityGreaterThan10();

		List<Product> filter = productF.apply(service.getProducts());

		System.out.println("Qantity");
		System.out.println(filter);

		System.out.println("Category");

		productF = p -> service.listProductCategoryComputing();
		filter = productF.apply(service.getProducts());
		System.out.println(filter);
	}

}
