package br.com.bbnsdevelop.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		String format = sdf.format(d);
		System.out.println(format);
		
		
		System.out.println("---------------------");
		
		sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		format = sdf.format(d);
		System.out.println(format);
		
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = "09/12/2021";
		Date parse = sdf.parse(date);
		String format2 = sdf.format(parse);
		System.out.println(parse);
		System.out.println(format2);
	}

}
