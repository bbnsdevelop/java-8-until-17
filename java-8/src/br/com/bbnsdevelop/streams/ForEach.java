package br.com.bbnsdevelop.streams;

import br.com.bbnsdevelop.services.product.ProductService;

public class ForEach {
	
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		service.getProducts().forEach(p ->{
			System.out.println(p);
		});
	}

}
