package br.com.bbnsdevelop.threads.trainings.ef;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		CheckProcessorTask[] cpts = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask checkProcessorTask : cpts) {
			pool.submit(checkProcessorTask);
		}
		
		pool.shutdown();
	}

}
