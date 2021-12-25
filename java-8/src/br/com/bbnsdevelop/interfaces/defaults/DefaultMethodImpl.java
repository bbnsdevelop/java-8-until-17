package br.com.bbnsdevelop.interfaces.defaults;

public class DefaultMethodImpl implements DefaultMethod, DiamondProblemDefaultMethod{

	@Override
	public void method1() {
		System.out.println("Override default method - DefaultMethod");
	}

}
