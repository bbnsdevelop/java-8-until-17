package br.com.bbnsdevelop.v2_examples.factories.method.pizza;

import java.util.List;

public class PizzaStore {

	public void orderPizza(List<Ingredient> ingredients) {
		IPizza p = PizzaFactory.createPizza(ingredients);		
		
		if (p != null) {
			p.prepare(ingredients);
			p.bake();
			p.cut();
		}
	}

	

}
