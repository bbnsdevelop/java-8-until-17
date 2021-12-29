package br.com.bbnsdevelop.jvmarchitecture.classloading;

public class MultipleObjects {
	
	
	
	public static void main(String[] args) {
		User u1 = new User();
		Class c1 = u1.getClass();
		
		User u2 = new User();
		Class c2 = u2.getClass();

		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1 == c2);
	}
	
}
