package br.com.bbnsdevelop.v2_examples.decorator;

public class PizzaDecorator implements IPizza {

	private IPizza pizza;
	
	
	public PizzaDecorator(IPizza pizza) {
		this.pizza = pizza;
	}


	@Override
	public void bake() {
		pizza.bake();

	}

}
