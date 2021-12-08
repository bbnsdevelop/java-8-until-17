package br.com.bbnsdevelop.stringHandling.immutable;

public class ImmutableDemo {
	
	
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Bye";
		
		System.out.println("Before Concat: " + "\ns1:"+s1+"\ns2:"+s2);
		
		s1.concat(s2);
		
		System.out.println("Before Concat: " + "\ns1:"+s1+"\ns2:"+s2);
		
		s1 = s1.concat(s2);
		
		System.out.println("Before Concat: " + "\ns1:"+s1+"\ns2:"+s2);
	}

}
