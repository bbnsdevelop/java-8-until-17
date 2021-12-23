package br.com.bbnsdevelop.threads;

public class CheckProcessor extends Thread implements Runnable {

	public static void main(String[] args) {
		
		CheckProcessor cp = new CheckProcessor();
		
		//Thread t = new Thread(cp);		
		// t.start();
		
		cp.start();
		
	}

	@Override
	public void run() {
		System.out.println("Processed the checks");
		
	}

}
