package br.com.bbnsdevelop.v2_examples.decorator;

public class CheesePizzaDecorator extends PizzaDecorator{

	public CheesePizzaDecorator(IPizza pizza) {
		super(pizza);		
	}
	
	
	@Override
	public void bake() {		
		super.bake();
		System.out.println("Adding cheese toppings");
	}

}
