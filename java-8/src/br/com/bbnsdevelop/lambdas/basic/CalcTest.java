package br.com.bbnsdevelop.lambdas.basic;

public class CalcTest {
	
	public static void main(String[] args) {
		Calc i = (a,b) -> a * b;
		
		double reponse = i.exec(5.3, 2.8);
		System.out.println(String.format("%.2f", reponse));
	}

}
