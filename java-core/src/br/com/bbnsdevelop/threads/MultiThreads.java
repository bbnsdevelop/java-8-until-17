package br.com.bbnsdevelop.threads;

public class MultiThreads extends Thread {

	public static void main(String[] args) {
		MultiThreads mt = new MultiThreads();
		mt.start();
		for (int j = 0; j <= 200; j++) {
			System.out.println("J: " + j +"\t");
			
		}
		
	}
	
	@Override
	public void run() {
		printNumbersI();
	}
	
	void printNumbersI() {
		for (int i = 0; i <= 200; i++) {
			System.out.println("i: " + i +"\t");
			
		}
	}
	

}
