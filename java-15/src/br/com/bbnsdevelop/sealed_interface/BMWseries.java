package br.com.bbnsdevelop.sealed_interface;

@SuppressWarnings("preview")
public sealed interface BMWseries permits ThreeSeries, FiveSeries{
	
	public void myMethod();

}
