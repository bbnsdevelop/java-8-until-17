package br.com.bbnsdevelop.streams;

import java.util.List;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class Map {
	
	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		System.out.println("-------------------Before-update-value-----------------------------");
		service.getProducts().forEach(p ->{
			System.out.println(p);
		});
		
		
		List<Product> list = service.getProducts().stream().map(p -> service.updateValueIfCategoryIsHomeAppliance(p)).collect(Collectors.toList());
		
		System.out.println("-------------------After-update-value-----------------------------");
		list.forEach(p ->{
			System.out.println(p);
		});
	}

}
