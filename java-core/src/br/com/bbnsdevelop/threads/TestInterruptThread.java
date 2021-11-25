package br.com.bbnsdevelop.threads;

public class TestInterruptThread {

	public static void main(String[] args) {
		
		ThreadInterrupt t = new ThreadInterrupt();
		
		t.start();
		
		// t.interrupt();
		
		System.out.println("After interrupt");

	}

}
