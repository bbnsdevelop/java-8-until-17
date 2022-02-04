package br.com.bbnsdevelop.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	public static void info(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("[INFO] " +sdf.format(new Date())+ " - " + msg);
	}

}
