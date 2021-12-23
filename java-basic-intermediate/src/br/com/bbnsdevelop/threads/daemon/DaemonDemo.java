package br.com.bbnsdevelop.threads.daemon;

public class DaemonDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		
		MyThread t = new MyThread();
		// t.setDaemon(true);
		System.out.println(t.isDaemon());
		
		t.start();
	}

}
