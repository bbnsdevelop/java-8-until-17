package br.com.bbnsdevelop.threads.sync.classlock;

public class DisplayMessage {
	
	public synchronized static void sayHello(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("How are you ".concat(name).concat("?"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
