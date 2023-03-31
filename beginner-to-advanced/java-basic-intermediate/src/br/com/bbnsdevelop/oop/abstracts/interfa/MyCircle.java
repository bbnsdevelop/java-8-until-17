package br.com.bbnsdevelop.oop.abstracts.interfa;

public class MyCircle implements Circle {

	public static void main(String[] args) {
		MyCircle m = new MyCircle();

		m.calculateArea(50);

	}

	@Override
	public void calculateArea(float ray) {
		System.out.println(PI * (ray * ray));

	}

}
