package br.com.bbnsdevelop.v2_examples.factories.method.pizza;

import java.util.List;
import java.util.function.Consumer;

public class VegPizza implements IPizza {

	@Override
	public void prepare(List<Ingredient> ingredients) {
		Consumer<Ingredient> consumer = i -> {
			System.out.println("Name: ".concat(i.getName()));
			System.out.println("Weight: " + i.getWeight());
			System.out.println("Quantity: " + i.getQuantity());
		};

		System.out.println("Preparing veggie Pizza");
		System.out.println("Ingredients to do a pizza");
		ingredients.forEach(consumer);
		
	}

	@Override
	public void bake() {
		System.out.println("Baking veggie pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cutting veggie pizza");

	}

}
