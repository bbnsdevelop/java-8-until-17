package br.com.bbnsdevelop.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	
	public static void main(String[] args) {
		Double d = 1234567.34346;
		
		NumberFormat defaul = NumberFormat.getInstance();
		System.out.println(defaul.format(d));
		
		
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(nf.format(d));
		
		Long l = 1245612314L;
		
		NumberFormat f = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(f.format(l));
	}

}
