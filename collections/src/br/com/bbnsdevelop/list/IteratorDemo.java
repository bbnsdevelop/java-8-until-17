package br.com.bbnsdevelop.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,5,60,50); 
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}	
		
	}

}
