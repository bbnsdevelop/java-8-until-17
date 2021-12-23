package br.com.bbnsdevelop.threads;

public class ThreadInterrupt extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Thread - " + i);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {

		}
	}

}
