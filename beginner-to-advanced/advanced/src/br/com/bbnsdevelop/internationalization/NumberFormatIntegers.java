package br.com.bbnsdevelop.internationalization;

import java.text.NumberFormat;

public class NumberFormatIntegers {

	public static void main(String[] args) {

		Double d = 1234567.34346;

		NumberFormat defaul = NumberFormat.getInstance();
		
		defaul.setMinimumFractionDigits(5);
		System.out.println(defaul.format(d));
		defaul.setMaximumFractionDigits(3);
		System.out.println(defaul.format(d));
		
		
		defaul.setMaximumIntegerDigits(6);
		System.out.println(defaul.format(d));
		
		

	}
}
