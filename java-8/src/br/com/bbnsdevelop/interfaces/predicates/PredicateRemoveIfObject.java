package br.com.bbnsdevelop.interfaces.predicates;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

import br.com.bbnsdevelop.services.product.CategoryTypes;
import br.com.bbnsdevelop.services.product.Product;
import br.com.bbnsdevelop.services.product.ProductService;

public class PredicateRemoveIfObject {
	
	public static void main(String[] args) {
		ProductService service = new ProductService();

		Predicate<Product> categorySmarPhone = product -> product.getCategory().equals(CategoryTypes.HOMEAPPLIANCE);

		CopyOnWriteArrayList<Product> cpList = new CopyOnWriteArrayList<>(service.getProducts());
		cpList.removeIf(categorySmarPhone);
		System.out.println(cpList);
	}

}
