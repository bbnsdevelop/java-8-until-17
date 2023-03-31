package br.com.bbnsdevelop.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsRemove {
	
	public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
		
		for (int i = 10; i <= 100; i = i +10) {
			list.add(i);
		}
	
		
		System.out.println(list);		
		list.remove(3);		
		System.out.println(list);
	}

}
