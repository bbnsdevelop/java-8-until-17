package br.com.bbnsdevelop.generics.basic;

public class Box {
	
	private Object thing;
	
	public void save(Object thing) {
		this.thing = thing;
	}
	
	public Object open() {
		return this.thing;
	}

}
