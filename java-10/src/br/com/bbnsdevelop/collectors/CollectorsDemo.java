package br.com.bbnsdevelop.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
	
	
	public static void main(String[] args) {
		List<Integer> list = List.of(15,30,40,50,60,70,80);
		
		List<Integer> list2 = list.stream().filter( i -> i% 3==0).collect(Collectors.toUnmodifiableList());
		// This list2 is Unmodifiable List
		//list2.add(10);
		System.out.println(list2);
	}

}
