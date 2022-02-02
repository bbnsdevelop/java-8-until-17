package br.com.bbnsdevelop.jpa.view;

import java.util.Scanner;
import java.util.function.Consumer;

import br.com.bbnsdevelop.jpa.entities.ItemOrder;
import br.com.bbnsdevelop.jpa.entities.Order;
import br.com.bbnsdevelop.jpa.entities.Product;
import br.com.bbnsdevelop.jpa.service.OrderService;

public class OrderView {
	
	private static OrderService orderService = new OrderService();
	
	protected static void findOrder() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();
		Order order = orderService.findById(id);
		System.out.println("Date of transaction: " + order.getDate());
		Consumer<ItemOrder> consumer = i -> System.out.println("Product: " +i.getProduct().getName() + " Quantity: " + i.getQuantity() + " Total price: " + i.getPrice());
		
		order.getItens().forEach(consumer);
		
	}
	
	protected static void buyItem() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type name of product: ");
		String name = in.nextLine();
		System.out.println("Type price: ");
		Double price = in.nextDouble();
		
		System.out.println("Type quantity: ");
		int quantity = in.nextInt();
		
		Order oder = new Order();		
		Product product = new Product(name, price);
		ItemOrder item = new ItemOrder(oder, product, quantity);
		
		String result = orderService.save(item);
		System.out.println(result);
	}

}
