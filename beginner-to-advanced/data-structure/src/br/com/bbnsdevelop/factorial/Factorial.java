package br.com.bbnsdevelop.factorial;

public class Factorial {
	
	public int factorial(int n) {
		// List<Integer> listInt = new ArrayList<>();
		int res;
		if(n == 0 || n == 1) {
			res = 1;
		}
		else{
			res = n * factorial(n - 1);
			// listInt.add(res);
		}
		// System.out.println(listInt);
		return res;
	}
	
	
	
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		int num = 8;
		
		int res = f.factorial(num);
		System.out.println(res);
	}

}
