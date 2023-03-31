package br.com.bbnsdevelop;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class LowestValueJava8 {

	public static void main(String[] args) {
		int vector[] = { 10, 35, 40, 12, 8, 3, 90, 1 };		
		
		List<Integer> list = Arrays.stream(vector).boxed().collect(Collectors.toList());		
		int low = list.stream().mapToInt(l -> l).min().orElseThrow(NoSuchElementException::new);
		
		System.out.println(low);
	}
	

}
