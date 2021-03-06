package br.com.bbnsdevelop.threads;

import java.util.Scanner;

public class JoinDemo extends Thread{
	static int n, sum = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		System.out.println("Sum of first 'N' numbers");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		JoinDemo.n = scan.nextInt();
		JoinDemo j = new JoinDemo();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("Sum of first "+ JoinDemo.n+" Numbers is "+JoinDemo.sum);
		long finish = System.currentTimeMillis();
		
		long result = (finish - start) / 1000;
		
		System.out.println("The total time taken is: "+ result+" Seconds");
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
	}

}
