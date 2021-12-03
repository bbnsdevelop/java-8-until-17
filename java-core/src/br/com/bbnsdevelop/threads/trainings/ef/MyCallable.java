package br.com.bbnsdevelop.threads.trainings.ef;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	int num;
	
	public MyCallable(int num) {
		this.num = num;
	}
	
	@Override
	public Integer call() throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " Is calculating the sume of all the numbers up to " + num);
		
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {
				sum +=i;
		}
		
		return sum;
	}

}
