package br.com.bbnsdevelop.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest {

	public static void main(String[] args) {
		
			List<Product> products = new ArrayList<>();
	        Product product1 = new Product("123", "Laptop Lenovo", 2000.0, 10);
	        Product product2 = new Product("321", "Picanha", 10d, 10);
	        Product product3 = new Product("879", "Teclado Razer", 1000.0, 0);
	        Product product4 = new Product("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
	        products.add(product1);
	        products.add(product2);
	        products.add(product3);
	        products.add(product4);
	       
	        Iterator<Product> ProductIterator = products.iterator();
	        
	        while (ProductIterator.hasNext()) {
	            if (ProductIterator.next().getQtd() == 0) {
	                ProductIterator.remove();
	            }
	        }
			System.out.println(products.size());

	}

}