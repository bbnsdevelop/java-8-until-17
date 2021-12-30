package br.com.bbnsdevelop.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

	private static final String DD_MM_YYYY = "dd/MM/yyyy";
	private static final String MM_DD_YYYY = "MM/dd/yyyy";

	private static final DateTimeFormatter DATE_TIME_FORMATTER_DDMMYYYY = DateTimeFormatter.ofPattern(DD_MM_YYYY);

	public DateUtils() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * @author bbnsdevelop
	 * @param localDate, not null
	 * @return String with the formatter based on the pattern dd/MM/yyyy
	 * 
	 */
	public static String formatLocalDateToStringDDMMYYYY(LocalDate localDate) {
		return localDate.format(DATE_TIME_FORMATTER_DDMMYYYY);
	}

	/**
	 * @author bbnsdevelop
	 * @param localDate, not null
	 * @param date       pattern, if pattern is null or empty or blank default is
	 *                   dd/MM/yyyy
	 * @throws UnsupportedTemporalTypeException if the pattern is invalid
	 * @return String with the formatter based on the pattern
	 * 
	 */
	public static String formatLocalDateToStringDynamicPattern(LocalDate localDate, String pattern) {
		try {
			if (pattern == null || pattern.isEmpty() || pattern.isBlank()) {
				pattern = DD_MM_YYYY;
			}
			return localDate.format(DateTimeFormatter.ofPattern(pattern));
		} catch (UnsupportedTemporalTypeException e) {
			throw e;
		}
	}

	public static LocalDate convertStringToLocalDate(String stringDate, Locale l) {
		DateTimeFormatter dtf = null;
		if (l.equals(Locale.US)) {
			dtf = DateTimeFormatter.ofPattern(DD_MM_YYYY);
		} else if (l.equals(Locale.UK)) {
			dtf = DateTimeFormatter.ofPattern(MM_DD_YYYY);
		} else {
			throw new IllegalStateException("Format not supported");
		}
		dtf = dtf.withLocale(l);
		LocalDate localDate = LocalDate.parse(stringDate, dtf);
		return localDate;

	}

	public static String convertDateToStringDDMMYYYY(Date d) {

		SimpleDateFormat sdf = new SimpleDateFormat(DD_MM_YYYY);
		String format = sdf.format(d);

		return format;
	}

	public static String convertDateToStringDDMMYYYYhhmmss(Date d) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String format = sdf.format(d);

		return format;
	}

	public static Date convertStringToDate(String stringDate) {
		SimpleDateFormat sdf = new SimpleDateFormat(DD_MM_YYYY);
		Date parse;
		try {
			parse = sdf.parse(stringDate);
		} catch (ParseException e) {
			throw new IllegalStateException("Format not supported");
		}
		return parse;
	}

}
