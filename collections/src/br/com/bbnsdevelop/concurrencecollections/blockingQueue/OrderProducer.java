package br.com.bbnsdevelop.concurrencecollections.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	BlockingQueue<String> queue;
	

	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		try {
			queue.put("Mac Book Pro");
			queue.put("Acer Nitro 5");
			queue.put("Dell laptop");
			queue.put("Iphone");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
