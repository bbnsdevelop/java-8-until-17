package br.com.bbnsdevelop.collectionsUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	
	
	public static void main(String[] args) {
		
		String[] array = {"A", "B", "C"};
		
		
		List<String> list = Arrays.asList(array);		
		
		System.out.println("get first element array: " + array[0]);
		System.out.println("get first element list" + list.get(0));
		
		System.out.println("------------------------------");
		System.out.println(array);
		
		System.out.println("Reference memory");
		array[2] = "W";
		
		System.out.println(list);
		
		System.out.println("Change reference memory");
		
		List<String> list1 = new ArrayList<>(Arrays.asList(array));
		array[1] = "M";
		System.out.println(list1);
		
	}

}
