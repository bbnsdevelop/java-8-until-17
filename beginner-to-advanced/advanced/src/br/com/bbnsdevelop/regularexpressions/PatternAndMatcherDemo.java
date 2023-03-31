package br.com.bbnsdevelop.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherDemo {
	
	
	public static void main(String[] args) {
		String input = "abcdfghijabclmnop abcqrabc";
		
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println(matcher.group());
			
		}
	}

}
