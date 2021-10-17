package br.com.bbnsdevelop.basics;

public class Loop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			
			if(i % 10 == 0) {
				continue;
			}
			System.out.println(i);
			
		}
		int i = 0;
		
		for (i = test(); i < 10; i++) {
			System.out.println("for");
		}

	}
	
	static int test() {
		System.out.println("test");
		
		return 9;
	}

}
