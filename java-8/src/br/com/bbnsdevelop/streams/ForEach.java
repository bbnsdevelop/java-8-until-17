package br.com.bbnsdevelop.streams;

import br.com.bbnsdevelop.objTotest.ProductService;

public class ForEach {
	
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		service.getProducts().forEach(p ->{
			System.out.println(p);
		});
	}

}
