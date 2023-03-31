package br.com.bbnsdevelop.v2_examples.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator{

	public VeggiePizzaDecorator(IPizza pizza) {
		super(pizza);		
	}
	
	
	@Override
	public void bake() {		
		super.bake();
		System.out.println("Adding veggie toppings");
	}

}
