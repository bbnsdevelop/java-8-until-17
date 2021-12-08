package br.com.bbnsdevelop.stringHandling.immutable;

public class StringPoolDemo {

	public static void main(String[] args) {
		User u1 = new User(1, "Jhon");
		User u2 = new User(1, "Stive");
		User u3 = new User(1, "Stive");

		System.out.println(u1);
		System.out.println(u1.name.hashCode());
		System.out.println(u2);

		String s1 = "abc";// here will use the same location on memory - JVM use a pool, because the information is equal
		String s2 = "abc"; // here will use the same location on memory - JVM use a pool, because the information is equal
		String s4 = "azx";
		String s5 = new String("abc");
		String s3 = u1.name;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		
		
		System.out.println(s1  == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1  == s5);
		System.out.println(s1.equals(s5));
		
		System.out.println(u2  == u3);
		System.out.println(u2.equals(u3));
		System.out.println(u2.name.equals(u3.name));
		
		

	}

}
