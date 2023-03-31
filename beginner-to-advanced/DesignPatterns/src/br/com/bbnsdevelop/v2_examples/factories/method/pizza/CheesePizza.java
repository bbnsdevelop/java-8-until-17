package br.com.bbnsdevelop.v2_examples.factories.method.pizza;

import java.util.List;
import java.util.function.Consumer;

public class CheesePizza implements IPizza {

	@Override
	public void prepare(List<Ingredient> ingredients) {
		Consumer<Ingredient> consumer = i -> {
			System.out.println("Name: ".concat(i.getName()));
			System.out.println("Weight: " + i.getWeight());
			System.out.println("Quantity: " + i.getQuantity());
		};

		System.out.println("Preparing Cheese Pizza");
		System.out.println("Ingredients to do a pizza");
		ingredients.forEach(consumer);
		
	}

	@Override
	public void bake() {
		System.out.println("Baking cheese pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cutting cheese pizza");

	}

}
