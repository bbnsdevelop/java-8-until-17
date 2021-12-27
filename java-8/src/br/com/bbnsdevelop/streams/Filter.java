package br.com.bbnsdevelop.streams;

import java.util.List;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.objTotest.CategoryTypes;
import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class Filter {
	
	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		
		
		long count = service.getProducts().stream().filter(p -> p.getCategory().equals(CategoryTypes.COMPUTING)).count();
		
		System.out.println(count);
		
		List<Product> collect = service.getProducts().stream().filter(p -> p.getCategory().equals(CategoryTypes.COMPUTING)).collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<Product> list = service.getProducts().stream().filter(p -> p.getQuantity() >= 15).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
