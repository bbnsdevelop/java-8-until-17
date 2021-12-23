package br.com.bbnsdevelop.basics;

public class DataTypeCasting {

	public static void main(String[] args) {
		
		char ch = 'A';
		int i = ch;
		System.out.println("implicit casting");
		System.out.println(i);
		
		
		long l = (long) Double.MAX_VALUE;
		double d = Double.MAX_VALUE;
		
		System.out.println("Explicit casting");
		System.out.println("Attention when we used casting probably will lose values, look below");
		System.out.println(l);
		System.out.println(d);
		
		

	}

}
