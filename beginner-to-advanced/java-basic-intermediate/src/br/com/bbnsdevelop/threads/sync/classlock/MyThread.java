package br.com.bbnsdevelop.threads.sync.classlock;

public class MyThread extends Thread{
	
	String name;

	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {		
		DisplayMessage.sayHello(name);
	}
	
	

}
