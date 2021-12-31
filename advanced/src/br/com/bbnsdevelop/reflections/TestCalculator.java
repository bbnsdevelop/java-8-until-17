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
			
			System.out.println("--------GET--------");
			Method method = myClass.getMethod("getNum1", null);
			Object invoke = method.invoke(newInstance2, null);			
			System.out.println(invoke);
			
			method = myClass.getMethod("getNum2", null);
			invoke = method.invoke(newInstance2, null);			
			System.out.println(invoke);
			
			System.out.println("-------SET-GET--------");
			Method setNum1 = myClass.getMethod("setNum1",double.class);			
			setNum1.invoke(newInstance2, 51);
			method = myClass.getMethod("getNum1", null);
			invoke = method.invoke(newInstance2, null);			
			System.out.println(invoke);
			
			
			Method setNum2 = myClass.getMethod("setNum2",double.class);			
			setNum2.invoke(newInstance2, 65);			
			method = myClass.getMethod("getNum2", null);
			invoke = method.invoke(newInstance2, null);			
			System.out.println(invoke);
			
			
			Method sum = myClass.getMethod("sum",int.class, int.class);
			invoke = sum.invoke(newInstance2, 5, 15);
			System.out.println(invoke);
			
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
