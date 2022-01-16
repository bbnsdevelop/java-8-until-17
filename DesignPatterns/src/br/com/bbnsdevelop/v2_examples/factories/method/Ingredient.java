package br.com.bbnsdevelop.v2_examples.factories.method;

public class Ingredient {
	private String name;
	private double weight;
	private int quantity;
	
	
	public Ingredient() {
	}

	public Ingredient(String name, double weight, int quantity) {		
		this.name = name;
		this.weight = weight;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", weight=" + weight + ", quantity=" + quantity + "]";
	}

		

}
