package br.com.bbnsdevelop.stringHandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());
		
		sb.append("All the power is with in you")
		.append(" You can do anything and everything");
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("abcd");
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.insert(3, "xyz"));
		
		
		System.out.println(sb1.delete(3, 6));
	}

}
