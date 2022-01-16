package br.com.bbnsdevelop.v2_examples.factories.method;

import java.util.List;
import java.util.function.Consumer;

public class ChickenPizza implements IPizza {

	@Override
	public void prepare(List<Ingredient> ingredients) {
		Consumer<Ingredient> consumer = i -> {
			System.out.println("Name: ".concat(i.getName()));
			System.out.println("Weight: " + i.getWeight());
			System.out.println("Quantity: " + i.getQuantity());
		};

		System.out.println("Preparing Chicken Pizza");
		System.out.println("Ingredients to do a pizza");
		ingredients.forEach(consumer);
		
	}

	@Override
	public void bake() {
		System.out.println("Baking Chicken pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cutting Chicken pizza");

	}

}
