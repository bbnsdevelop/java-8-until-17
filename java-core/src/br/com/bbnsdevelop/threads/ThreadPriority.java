package br.com.bbnsdevelop.threads;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		ThreadPriority mt = new ThreadPriority();

		mt.setPriority(MIN_PRIORITY);
		mt.setName("Thread-mt");
		mt.start();

		ThreadPriority mt2 = new ThreadPriority();

		mt2.setPriority(MAX_PRIORITY);
		mt2.setName("Thread-mt2");
		mt2.start();

		Thread current = Thread.currentThread();
		System.out.println("Name -> " + current.getName());
	}

	@Override
	public void run() {
		Thread current = Thread.currentThread();		
		System.out.println("Name -> " + current.getName());

	}

}
