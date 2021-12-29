package br.com.bbnsdevelop.jvmarchitecture.classloading;

import java.lang.reflect.Method;

public class UserTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("br.com.bbnsdevelop.jvmarchitecture.classloading.User");
		
		Method[] declaredMethods = c.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		System.out.println(declaredMethods.length);
	}

}
