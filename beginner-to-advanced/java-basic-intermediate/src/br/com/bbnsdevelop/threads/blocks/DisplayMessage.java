package br.com.bbnsdevelop.threads.blocks;

public class DisplayMessage {

	public void sayHello(String name) {
		
		synchronized (this) {
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

}
