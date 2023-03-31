package br.com.bbnsdevelop.v2_examples.flyweight;

public class PaintApp {

	public void render(int numberOfShapes) {

		Shape shape = null;

		for (int i = 1; i <= numberOfShapes; i++) {
			if (i % 2 == 0) {								
				shape = Shapefactory.get("circle");
				shape.draw(1, "red", "white");
			} else {
				shape = Shapefactory.get("rectangle");
				shape.draw(i, (i+i), "dotted");
			}
		}
	}

}
