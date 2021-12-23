package br.com.bbnsdevelop.generics;

public class AnyRunnableTest{
	
	public static void main(String[] args) {
		AnyRunnable<Thread> t = new AnyRunnable<>();
		
		// Here has error because we restrict a Generic class, extends Runnable and String not implements that
		// AnyRunnable<String> t2 = new AnyRunnable<>();
	}

}
