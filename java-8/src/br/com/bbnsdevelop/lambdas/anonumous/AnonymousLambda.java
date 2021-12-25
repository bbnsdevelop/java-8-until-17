package br.com.bbnsdevelop.lambdas.anonumous;

public class AnonymousLambda {

	public static void main(String[] args) {
		Thread t = new Thread( () -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread: " + i);
			}

		});

		t.start();

		for (int i = 11; i <= 20; i++) {
			System.out.println("Main Thread: " + i);
		}

	}
}
