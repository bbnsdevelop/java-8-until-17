package br.com.bbnsdevelop.generics;

public class MyGenericsClass<T> {

	T obj;
	
	public MyGenericsClass() {
		
	}

	public MyGenericsClass(T obj) {
		this.obj = obj;
	}
	
	
	
	public void displayObjectDetails() {
		System.out.println("The type of object: "+ obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}

	 
}
