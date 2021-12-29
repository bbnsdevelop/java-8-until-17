package br.com.bbnsdevelop.streams;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import br.com.bbnsdevelop.services.product.CategoryTypes;
import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class ReduceDemo {
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		Predicate<Product> predicate = p -> p.getCategory().equals(CategoryTypes.COMPUTING);
		
		Function<Product, Double> functionPriceMultQuant = p -> p.getPrice() * p.getQuantity();
		BinaryOperator<Double> sum = (x,y) -> x + y;
		
		Consumer<Double> consumer = priceFormat -> System.out.print(String.format("%.2f", priceFormat));
		
		service.getProducts().stream().filter(predicate).map(functionPriceMultQuant).reduce(sum).ifPresent(consumer);
		
		
	}

}
