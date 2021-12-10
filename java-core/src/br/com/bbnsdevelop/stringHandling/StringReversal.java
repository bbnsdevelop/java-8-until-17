package br.com.bbnsdevelop.stringHandling;

public class StringReversal {

	public static void main(String[] args) {
		
		StringReversal r = new StringReversal();
		System.out.println(r.firstWay("bbnsdevelop"));
		System.out.println(r.secondWay("bbnsdevelop"));

	}

	public String firstWay(String actual) {
		String reversed = "";

		for (int i = actual.length(); i > 0; i--) {
			reversed +=actual.charAt(i-1);
		}
		return reversed;
	}
	
	public String secondWay(String actual) {
		byte[] s1 = actual.getBytes();
		byte[] s2 = new byte[s1.length];
		
		for(int i = 0; i<s1.length;i++) {
			s2[i] = s1[s1.length-i-1];
		}
		String reversed = new String(s2);
		
		return reversed;
				
	}

}
