package br.com.bbnsdevelop.threads;

public class SingleThreaded{
	
	
	public static void main(String[] args) {
		
		SingleThreaded st = new SingleThreaded();
		st.printNumbersI();
		st.printNumbersJ();
		
		
	}
	
	
	
	
	void printNumbersI() {
		for (int i = 0; i <= 200; i++) {
			System.out.println("i: " + i +"\t");
			
		}
	}
	
	void printNumbersJ() {
		for (int j = 0; j <= 200; j++) {
			System.out.println("J: " + j +"\t");
			
		}
	}

}
