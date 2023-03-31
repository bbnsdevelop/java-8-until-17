package br.com.bbnsdevelop.v2_examples.singleton;

public class LoggerSingleton implements Cloneable {

	private static LoggerSingleton instance;
	private String msg;

	private LoggerSingleton(String msg) {
		this.msg = msg;
	}

	public static LoggerSingleton getInstance(String msg) {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new LoggerSingleton(msg);
				}
			}

		}
		return instance;

	}

	public String getMsg() {
		return this.msg;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
