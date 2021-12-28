package br.com.bbnsdevelop.streams;

import java.util.List;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class MapLambdaExpression {

	public static void main(String[] args) {

		ProductService service = new ProductService();
		System.out.println("-------------------Before-update-Quantiry-----------------------------");
		service.getProducts().forEach(System.out::println);

		List<Product> list = service.getProducts().stream().map(p -> {
			Integer newQuantiry = p.getQuantity() * 2;
			p.setQuantity(newQuantiry);
			return p;
		}).collect(Collectors.toList());

		System.out.println("-------------------After-update-Quantiry-----------------------------");
		list.forEach(System.out::println);
	}

}
