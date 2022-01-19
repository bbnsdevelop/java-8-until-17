package br.com.bbnsdevelop.v2_examples.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		IPizza pizza = new PlainPizza();
		pizza.bake();

		System.out.println("-".repeat(50));

		pizza = new CheesePizzaDecorator(new PlainPizza());
		pizza.bake();

		System.out.println("-".repeat(50));

		pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();
	}

}
