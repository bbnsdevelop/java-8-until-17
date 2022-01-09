package br.com.bbnsdevelop.instanceofpattern;

public class InstanceOfPatternMatchingDemo {
	
	
	public static void main(String[] args) {
	
		Object object = get();
		
		if(object instanceof String str) {
			System.out.println(str);
		}
		
	}
	
	public static Object get() {
		return "Pattern matching in action";
	}

}
