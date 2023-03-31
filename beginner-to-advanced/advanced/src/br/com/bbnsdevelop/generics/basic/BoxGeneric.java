package br.com.bbnsdevelop.generics.basic;

public class BoxGeneric<T> {

	private T thing;

	public void save(T thing) {
		this.thing = thing;
	}

	public T open() {
		return this.thing;
	}

}
