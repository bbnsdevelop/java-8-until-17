package br.com.bbnsdevelop.v2_examples.decorator;

public class PlainPizza implements IPizza{

	@Override
	public void bake() {
		System.out.println("Baking Plain pizza");
		
	}

}
