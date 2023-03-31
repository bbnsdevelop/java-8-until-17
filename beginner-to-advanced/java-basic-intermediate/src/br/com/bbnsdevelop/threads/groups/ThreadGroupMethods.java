package br.com.bbnsdevelop.threads.groups;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup mtg = new ThreadGroup("MyThreadGroup");
		
		CustomThread thread1 = new CustomThread(mtg, "Thread 1");
		CustomThread thread2 = new CustomThread(mtg, "Thread 2");
		CustomThread thread3 = new CustomThread(mtg, "Thread 3");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
		System.out.println(mtg.activeCount());
		
		
		// mtg.list();
		Thread.sleep(5000);		
		System.out.println(mtg.activeGroupCount());
		
		mtg.list();
	}

}
