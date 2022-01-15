package br.com.bbnsdevelop.v2_examples.singleton;

import java.util.Date;

public class DateUtilDemo {
	
	public static void main(String[] args) {
		
		DateUtil date1 = DateUtil.getInstance(new Date());
		DateUtil date2 = DateUtil.getInstance(new Date(30/12/2021));
		
		System.out.println(date1.getDate());
		System.out.println(date2.getDate());
		
		System.out.println("Same information");
		System.out.println(date1 == date2);
	}

}
