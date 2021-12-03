package br.com.bbnsdevelop.threads.trainings.ef;

public class CheckProcessorTask implements Runnable {

	String name;
	public CheckProcessorTask(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " Check processor has bagan processing the check " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " Check processor has completed processing the check " + Thread.currentThread().getName());
	}

}
