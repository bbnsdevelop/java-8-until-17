package br.com.bbnsdevelop.reference;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class MethodRefDemo {

	public static void main(String[] args) {
		ProductService service = new ProductService();

		service.getProducts().forEach(System.out::println);
		
		System.out.println("--------------Reference ::   -----------------------");
		service.getProducts().forEach(Product::display);
		
	}

}
