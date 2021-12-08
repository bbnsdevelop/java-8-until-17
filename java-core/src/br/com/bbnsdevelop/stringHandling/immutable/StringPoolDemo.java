package br.com.bbnsdevelop.stringHandling.immutable;

public class StringPoolDemo {

	public static void main(String[] args) {
		User u1 = new User(1, "Jhon");
		User u2 = new User(1, "Stive");

		System.out.println(u1);
		System.out.println(u1.name.hashCode());
		System.out.println(u2);

		String s1 = "abc";// here will use the same location on memory - JVM use a pool, because the information is equal
		String s2 = "abc"; // here will use the same location on memory - JVM use a pool, because the information is equal

		String s3 = u1.name;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}
