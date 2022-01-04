package br.com.bbnsdevelop.trywithresources;

public class MyWorker implements AutoCloseable{
	
	public MyWorker() {
		System.out.println("Create instance");
	}
	
	public void doSomething() {
		System.out.println("create a logic here");
	}

	@Override
	public void close() throws Exception {
		System.out.println("closed");
		
	}

}
