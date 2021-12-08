package br.com.bbnsdevelop.stringHandling;

public class StringMethods {
	
	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println("Lenght of the string is: "+s.length());
		System.out.println("IndexOf: "+s.indexOf("o"));
		
		System.out.println("CharAt: "+ s.charAt(0));
		
		System.out.println("Substring with beginning index: "+s.substring(3));
		System.out.println("Substring with beginning index: "+s.substring(1, 3));
		
		
		String[] split = s.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		s.replace(" ", "-"); // is immutable
		
		System.out.println(s);
		
		s = s.replace(" ", "-");
		System.out.println(s);
		
	}

}
