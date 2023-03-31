package br.com.bbnsdevelop.reflections;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	
	public String value1();
	public String value2();

}
