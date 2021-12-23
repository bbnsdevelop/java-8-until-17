package br.com.bbnsdevelop.collectionsUtils;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	
	
	public static void main(String[] args) {
		
		String[] array = {"A", "B", "C"};
		
		System.out.println(array[0]);
		
		List<String> list = Arrays.asList(array);		
		
		System.out.println(list.get(0));
	}

}
