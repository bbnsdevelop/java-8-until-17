package br.com.bbnsdevelop.nullpointer;

public class NullpointerHelp {
	
	public static void main(String[] args) {
		String str = null;
		
		
		System.out.println(str.concat(""));
		// put this arg on run configuration
		// -XX:+ShowCodeDetailsInExceptionMessages
		
		
		
		/*
		 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "str" is null
			at br.com.bbnsdevelop.nullpointer.NullpointerHelp.main(NullpointerHelp.java:8)

		 */
	}

}
