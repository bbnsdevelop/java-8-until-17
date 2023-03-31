package br.com.bbnsdevelop.annotations;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarning {
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		DeprecatedMethod d = new DeprecatedMethod();
		
		// not warning
		d.method1();
		d.name = "John";
		
		
		d.method2();
		
		DeprecateClass dprecatedClass = new DeprecateClass();
		
		dprecatedClass.test();
		
		List list = new ArrayList();
		
		System.out.println(list);
	}

}
