package br.com.bbnsdevelop.stringApi;

import java.util.stream.Collectors;

public class StringUpdates {
	
	public static void main(String[] args) {
		
		String str = "                     ";		
		System.out.println(str.isBlank());
		System.out.println("---------------------------");
		
		str = "I am \nthe \ncreator \nof my destiny";
		System.out.println(str);
		System.out.println("---------------------------");
		System.out.println(str.lines().collect(Collectors.toList()));
		
		
		
		char c = '\u2000';
		str+=c+".";
		
		System.out.println(str.trim());
		
		System.out.println("-------------");
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		
		
		System.out.println(str.stripTrailing());
		
		System.out.println("-".repeat(40));
		
		String html = """
				 ..............<html>
				 ..............    <body>
				 ..............        <p>Hello, world</p>
				 ..............    </body>
				 ..............</html>
				 ..............""";
		
		System.out.println(html.stripIndent());
	}

}
