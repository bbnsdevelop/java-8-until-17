package br.com.bbnsdevelop.v2_examples.singleton;

import java.util.Date;

public enum DateUtilEnumSingleton {
	
	INSTANCE;
	
	Date date;

	public Date getDate() {
		return date;
	}

	public void setName(Date date) {
		if(this.date == null) {
			this.date = date;			
		}
	}
	
	

}
