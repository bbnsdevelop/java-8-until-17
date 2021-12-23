package br.com.bbnsdevelop.threads.sync.deadlocks;

public class DeadLockDemo implements Runnable {
	
	FirstResourse fr = new FirstResourse();
	SecondtResourse sr = new SecondtResourse();
	
	public DeadLockDemo() {
		new Thread(this).start();
		sr.method1(fr);
	}

	public static void main(String[] args) {
		new DeadLockDemo();
		

	}

	@Override
	public void run() {
		
		fr.method1(sr);
	}

}
