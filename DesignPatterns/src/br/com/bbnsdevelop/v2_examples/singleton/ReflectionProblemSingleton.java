package br.com.bbnsdevelop.v2_examples.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@SuppressWarnings("rawtypes")
public class ReflectionProblemSingleton {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		DateUtil date1 = DateUtil.getInstance(new Date());
		DateUtil date2 = null;
		// DateUtil.getInstance(new Date(30/12/2021));

		Constructor[] constructors = DateUtil.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			date2 = (DateUtil) constructor.newInstance(new Date(30 / 12 / 2021));
			break;
		}

		System.out.println(date1.getDate());
		System.out.println(date2.getDate());

		System.out.println("Same information");
		System.out.println(date1 == date2);
		
		
		DateUtilEnumSingleton date3 = DateUtilEnumSingleton.INSTANCE;
		date3.setName(new Date());
		DateUtilEnumSingleton date4 = null;
		
		Constructor[] constructors1 = DateUtilEnumSingleton.class.getDeclaredConstructors();

		for (Constructor constructor : constructors1) {
			constructor.setAccessible(true);
			// here has a problem, we can't instantiation ENUM
			// date4 = (DateUtilEnumSingleton) constructor.newInstance();
			// date4.setName(new Date(25/12/2021));
			break;
		}

		System.out.println(date3.getDate());
		//System.out.println(date4.getDate());

		System.out.println("Same information ENUM");
		System.out.println(date3 == date4);
		

	}

}
