package br.com.bbnsdevelop.date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatTimeDemo {

	public static void main(String[] args) {

		Date d = new Date();

		DateFormat dateTime = DateFormat.getTimeInstance(2);
		String time = dateTime.format(d);

		System.out.println(time);
		
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(d));

	}

}
