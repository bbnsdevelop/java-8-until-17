package br.com.bbnsdevelop.v2_examples.factories.method.pizza;

import java.util.List;

public interface IPizza {
	
	void prepare(List<Ingredient> ingredients);
	void bake();
	void cut();
}
