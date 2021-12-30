package br.com.bbnsdevelop.internationalization;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		String format = sdf.format(d);
		System.out.println(format);
		
		
		System.out.println("---------------------");
		
		sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		format = sdf.format(d);
		System.out.println(format);
	}

}
