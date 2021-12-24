package br.com.bbnsdevelop.concurrencecollections.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

	BlockingQueue<String> queue;
	

	public OrderConsumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		try {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				System.out.println(queue.take());				
			}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
