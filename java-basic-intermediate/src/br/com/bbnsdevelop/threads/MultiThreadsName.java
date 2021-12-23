package br.com.bbnsdevelop.threads;

public class MultiThreadsName extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreadsName mt = new MultiThreadsName();		
		mt.start();
	
		Thread current = Thread.currentThread();
		System.out.println("Name is: " + current.getName());
		
	}
	
	@Override
	public void run() {
		Thread current = Thread.currentThread();
		current.setName("PrintNumbers");
		System.out.println("Name is: " + current.getName());
	}
	
	
	

}
