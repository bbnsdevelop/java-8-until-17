package br.com.bbnsdevelop.reference;

import java.util.List;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class MethodRefDemo {

	public static void main(String[] args) {
		ProductService service = new ProductService();

		List<Product> products = service.getProducts();
		
		products.forEach(System.out::println);
		
		System.out.println("--------------Reference ::   -----------------------");
		products.forEach(Product::display);
		
		
		System.out.println("---------Service-----Reference ::   -----------------------");
		products.forEach(ProductService::updateValueIfCategoryIsSmartPhone);
		products.forEach(Product::display);
		
		
	}

}
