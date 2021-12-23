package br.com.bbnsdevelop.threads.sync.deadlocks;

public class SecondtResourse {
	
	
	public synchronized void method1(FirstResourse fr) {
		System.out.println("Inside method1 of SR");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method2 od FR");
		fr.method2();
	}
	
	public synchronized void method2() {
		System.out.println("Inside method2 of SR");	
	}

}
