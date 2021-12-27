package br.com.bbnsdevelop.objTotest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductService {

	private static final int PERCENTAGE_15 = 15;
	private static final int PERCENTAGE_10 = 10;

	private List<Product> products;

	public ProductService() {
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
				new Product(11, "Tablet", 1299.99, 16, CategoryTypes.COMPUTING),
				new Product(12, "Refrigerator", 2299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(13, "Microwave", 1499.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(14, "Stove", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new Product(15, "Washing machine", 3299.99, 15, CategoryTypes.HOMEAPPLIANCE)

		);
	}

	private List<ProductComparable> instanceProductComparable() {

		return Arrays.asList(new ProductComparable(1, "TV", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(2, "Laptop Core i3", 2899.99, 10, CategoryTypes.COMPUTING),
				new ProductComparable(3, "Laptop Core i7", 4299.99, 5, CategoryTypes.COMPUTING),
				new ProductComparable(4, "Iphone 12", 1299.99, 25, CategoryTypes.SMARTPHONE),
				new ProductComparable(5, "Sansung Galaxy", 1199.99, 150, CategoryTypes.SMARTPHONE),
				new ProductComparable(6, "TV 40", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(7, "TV 60", 3299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(8, "TV 80", 5299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(9, "Mouse", 49.99, 10, CategoryTypes.COMPUTING),
				new ProductComparable(10, "Monitor 27' ", 1299.99, 15, CategoryTypes.COMPUTING),
				new ProductComparable(11, "Tablet", 1299.99, 15, CategoryTypes.COMPUTING),
				new ProductComparable(12, "Refrigerator", 2299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(13, "Microwave", 1499.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(14, "Stove", 1299.99, 15, CategoryTypes.HOMEAPPLIANCE),
				new ProductComparable(15, "Washing machine", 3299.99, 15, CategoryTypes.HOMEAPPLIANCE)

		);
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<ProductComparable> getProductsComparable() {
		return instanceProductComparable();
	}

	public List<Product> listProductQuantityGreaterThan10() {

		Predicate<Product> p = produ -> produ.getQuantity() > 15;

		return this.products.stream().filter(p).collect(Collectors.toList());

	}

	public List<Product> listProductCategoryComputing() {

		Predicate<Product> p = produ -> produ.getCategory().equals(CategoryTypes.COMPUTING);

		return this.products.stream().filter(p).collect(Collectors.toList());

	}
	
	public List<Product> listProductCategoryComputing(List<Product> list) {

		Predicate<Product> p = produ -> produ.getCategory().equals(CategoryTypes.COMPUTING);

		return list.stream().filter(p).collect(Collectors.toList());

	}

	public static void updateValueIfCategoryIsSmartPhone(Product p) {
		ProductService s = new ProductService();
		if (s.checkCategory(p, CategoryTypes.SMARTPHONE)) {
			Double newValue = p.getPrice() + (p.getPrice() * 10) / 100;
			p.setPrice(newValue);
		}

	}

	public Product updateValueIfCategoryIsHomeAppliance(Product p) {
		if (checkCategory(p, CategoryTypes.HOMEAPPLIANCE)) {
			Double newValue = p.getPrice() + (p.getPrice() * PERCENTAGE_15) / 100;
			p.setPrice(newValue);
		}
		return p;
	}

	public void updateValue(Product p) {
		ProductService s = new ProductService();
		if (s.checkCategory(p, CategoryTypes.SMARTPHONE)) {
			Double newValue = p.getPrice() + (p.getPrice() * PERCENTAGE_10) / 100;
			p.setPrice(newValue);
		}

	}

	private Boolean checkCategory(Product p, CategoryTypes c) {
		Predicate<Product> predicate = produ -> produ.getCategory().equals(c);
		return predicate.test(p);
	}
}
