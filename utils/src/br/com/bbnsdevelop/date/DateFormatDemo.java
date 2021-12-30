package br.com.bbnsdevelop.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukDF = DateFormat.getDateInstance(0, Locale.UK);
		
		System.out.println("US: "+usDF.format(d));		
		System.out.println("UK: "+ukDF.format(d));
		
		System.out.println("----------------------------");
		
		usDF = DateFormat.getDateInstance(1, Locale.US);
		ukDF = DateFormat.getDateInstance(1, Locale.UK);
		System.out.println("US: "+usDF.format(d));		
		System.out.println("UK: "+ukDF.format(d));
		
		
		System.out.println("-----------------------------");
		
		usDF = DateFormat.getDateInstance(2, Locale.US);
		ukDF = DateFormat.getDateInstance(2, Locale.UK);
		System.out.println("US: "+usDF.format(d));		
		System.out.println("UK: "+ukDF.format(d));
		
		
		System.out.println("------------------------------");
		usDF = DateFormat.getDateInstance(3, Locale.US);
		ukDF = DateFormat.getDateInstance(3, Locale.UK);
		System.out.println("US: "+usDF.format(d));		
		System.out.println("UK: "+ukDF.format(d));
		
	}

}
