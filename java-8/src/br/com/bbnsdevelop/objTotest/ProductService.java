package br.com.bbnsdevelop.objTotest;

import java.util.Arrays;
import java.util.List;

public class ProductService {

	private List<Product> products;

	ProductService() {
		this.products = instanceProducts();
	}

	private List<Product> instanceProducts() {		

		return Arrays.asList(new Product(1, "TV", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(2, "Laptop Core i3", 2899.99, 10, CategoryTypes.COMPUTING),
				new Product(3, "Laptop Core i7", 4299.99, 5, CategoryTypes.COMPUTING),
				new Product(4, "Iphone 12", 1299.99, 25, CategoryTypes.SMARTPHONE),
				new Product(5, "Sansung Galaxy", 1199.99, 150, CategoryTypes.SMARTPHONE),
				new Product(6, "TV 40", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(7, "TV 60", 3299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(8, "TV 80", 5299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(9, "Mouse", 49.99, 10, CategoryTypes.COMPUTING),
				new Product(10, "Monitor 27' ", 1299.99, 15, CategoryTypes.COMPUTING),
				new Product(11, "Tablet", 1299.99, 15, CategoryTypes.COMPUTING),
				new Product(12, "Refrigerator", 2299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(13, "Microwave", 1499.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(14, "Stove", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(15, "Washing machine", 3299.99, 15, CategoryTypes.HOMEAPPLIANCE)

		);
	}
	
	public List<Product> getProducts(){
		return products;
	}

}
