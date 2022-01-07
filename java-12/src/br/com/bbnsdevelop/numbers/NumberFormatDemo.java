package br.com.bbnsdevelop.numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));

		format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

		System.out.println(format.format(1000));

		System.out.println(format.format(1000000));

		format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

		System.out.println(format.format(1000));

		System.out.println(format.format(1000000));

	}

}
