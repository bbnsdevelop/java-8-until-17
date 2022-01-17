package br.com.bbnsdevelop.v2_examples.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Shapefactory {

	private static Map<String, Shape> shapes = new HashMap<>();

	public static Shape get(String type) {
		initShape();
		return shapes.get(type);

	}

	private static void initShape() {
		if(shapes.isEmpty()) {			
			shapes.put("circle", new Circle());
			shapes.put("rectangle", new Rectangle());
		}
	}

}
