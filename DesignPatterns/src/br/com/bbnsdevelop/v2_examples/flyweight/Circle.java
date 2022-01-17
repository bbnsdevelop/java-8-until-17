package br.com.bbnsdevelop.v2_examples.flyweight;

public class Circle extends Shape {
	
	private String label;
	
	public Circle() {
		this.label = "Circle";
	}


	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		String circle = "Drwaing a " + label + " with radius " + radius + " fill collor " + fillColor + " line color "	+ lineColor;
		System.out.println(circle);
	}
	

}
