package br.com.bbnsdevelop.streams;

import br.com.bbnsdevelop.objTotest.ProductService;

public class Sorted {
	
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		service.getProducts().stream().sorted().forEach(p ->{
			System.out.println(p);
		});
	}

}
