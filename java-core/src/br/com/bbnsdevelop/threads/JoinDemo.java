package br.com.bbnsdevelop.threads;

import java.util.Scanner;

public class JoinDemo extends Thread{
	static int n, sum = 0;

	public static void main(String[] args) {
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
