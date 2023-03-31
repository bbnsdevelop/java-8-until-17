package br.com.bbnsdevelop.v2_examples.factories.method.pizza;

import java.util.List;
import java.util.stream.Collectors;

public class PizzaFactory {
	
	
	public static IPizza createPizza(List<Ingredient> ingredients) {
		IPizza p = null;
		
		if (cheesePizza(ingredients)) {
			p = new CheesePizza();
		} 
		else if (chickenPizza(ingredients)) {
			p = new ChickenPizza();
		} 
		else if (veggiePizza(ingredients)) {
			p = new VegPizza();
		}
		
		return p;
	}
	
	private static boolean cheesePizza(List<Ingredient> ingredients) {
		List<Ingredient> list = ingredients.stream().filter(i -> i.getName().equalsIgnoreCase("cheese"))
				.collect(Collectors.toList());
		return list == null ? false : list.size() == 0 ? false : list.size() > 0;
	}

	private static boolean chickenPizza(List<Ingredient> ingredients) {
		List<Ingredient> list = ingredients.stream().filter(i -> i.getName().equalsIgnoreCase("chicken"))
				.collect(Collectors.toList());
		return list == null ? false : list.size() == 0 ? false : list.size() > 0;
	}

	private static boolean veggiePizza(List<Ingredient> ingredients) {
		List<Ingredient> list = ingredients.stream().filter(i -> i.getName().equalsIgnoreCase("tomato"))
				.collect(Collectors.toList());
		return list == null ? false : list.size() == 0 ? false : list.size() > 0;
	}

}
