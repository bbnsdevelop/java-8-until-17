package br.com.bbnsdevelop.v2_examples.flyweight;

public class Rectangle extends Shape {
	
	private String label;
	
	public Rectangle() {
		this.label = "Rectangle";
	}
	


	@Override
	public void draw(int length, int breadth, String fillStyle) {

		String rectangle = "Drwaing a " + label + " with length " + length + " breadth "	+ breadth + " fill style " + fillStyle;
		System.out.println(rectangle);
	}

	

}
