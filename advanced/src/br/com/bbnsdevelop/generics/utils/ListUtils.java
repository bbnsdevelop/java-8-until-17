package br.com.bbnsdevelop.generics.utils;

import java.util.List;

public class ListUtils {
	
	
	public static Object getLast1(List<?> list) {
		return list.get(list.size() -1);
	}
	
	
	public static <T> T getLast2(List<T> list) {
		return list.get(list.size() -1);
	}

}
