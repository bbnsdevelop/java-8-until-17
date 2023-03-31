package br.com.bbnsdevelop.v2_examples.singleton;

import java.util.Date;

public class DateUtil {

	private static volatile DateUtil instance;
	private Date date;

	private DateUtil(Date date) {
		this.date = date;
	}

	public static DateUtil getInstance(Date date) {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil(date);
				}
			}

		}
		return instance;

	}

	public Date getDate() {
		return this.date;
	}

}
