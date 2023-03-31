package br.com.bbnsdevelop.threads.blocks;

public class MyThread extends Thread{
	
	String name;
	DisplayMessage dm;

	public MyThread(String name, DisplayMessage dm) {
		this.name = name;
		this.dm = dm;
	}
	
	@Override
	public void run() {		
		dm.sayHello(name);
	}
	
	

}
