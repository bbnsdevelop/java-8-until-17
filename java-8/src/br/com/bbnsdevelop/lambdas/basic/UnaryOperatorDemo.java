package br.com.bbnsdevelop.lambdas.basic;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import br.com.bbnsdevelop.objTotest.CategoryTypes;
import br.com.bbnsdevelop.objTotest.Product;
import br.com.bbnsdevelop.objTotest.ProductService;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		Predicate<Product> t = p -> p.getCategory().equals(CategoryTypes.COMPUTING);

		UnaryOperator<Product> tax10 = n -> {
			if (t.test(n)) {
				double price = n.getPrice() + (n.getPrice() * 10) / 100;
				Double newPrice = Double.valueOf(String.format("%.2f", price).replace(",", "."));
				n.setPrice(newPrice);
			}
			return n;
		};

		Consumer<Product> consumer = p -> System.out.println(p);
		
		service.getProducts().stream().map(tax10).collect(Collectors.toList()).stream().filter(t)
				.collect(Collectors.toList()).forEach(consumer);

	}
}
