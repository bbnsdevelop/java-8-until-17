package br.com.bbnsdevelop.trywithresources;

public class MyWorkerDemo {

	
	public static void main(String[] args) {
		
		
		try (MyWorker worker = new MyWorker()){
			
			worker.doSomething();
			
		} catch (Exception e) {
			
		}
	}
}
