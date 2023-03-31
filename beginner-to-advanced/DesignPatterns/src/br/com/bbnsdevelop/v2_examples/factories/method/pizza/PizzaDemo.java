package br.com.bbnsdevelop.v2_examples.factories.method.pizza;

import java.util.List;

public class PizzaDemo {
	
	
	public static void main(String[] args) {
		List<Ingredient> list = List.of(new Ingredient("chicken", 500, 1));
		
		
		PizzaStore store = new PizzaStore();
		store.orderPizza(list);
		
	}

}
