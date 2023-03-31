package br.com.bbnsdevelop.threads.communication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException{
		
		MyThread t = new MyThread();
		t.start();
		
		synchronized (t) {
			System.out.println("Main thread is going to wait");
			t.wait();
			System.out.println("Main thread notified");
			System.out.println(t.total);
		}
	}

}
