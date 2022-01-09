package br.com.bbnsdevelop.sealed_class;

@SuppressWarnings("preview")
public sealed class BMWseries permits ThreeSeries, FiveSeries{
	
	public void myMethod() {
		System.out.println("Inside myMethod");
	}

}
