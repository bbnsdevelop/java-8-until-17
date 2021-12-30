package br.com.bbnsdevelop.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {
	
	
	public static void main(String[] args) {
		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			
			Constructor<?> constructor = myClass.getConstructor(null);
			
			Object newInstance = constructor.newInstance(null);			
			
			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			Object newInstance2 = constructor2.newInstance(2.3, 4.6);
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
