package br.com.bbnsdevelop.threads.blocks;

public class SyncrhronizationDemo {
	
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread("Steve", dm);
		MyThread t2 = new MyThread("Mark", dm);
		
		t1.start();
		t2.start();
	}

}
