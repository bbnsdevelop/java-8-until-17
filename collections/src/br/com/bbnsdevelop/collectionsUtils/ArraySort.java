package br.com.bbnsdevelop.collectionsUtils;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 10, 8, 30, 20, 22, 19, 15, 31, 50, 35, 60, 1 };
		
		System.out.println("Before sorting: ");
		for(int element : a) {
			System.out.println(element);
		}
		
		
		Arrays.sort(a);
		System.out.println("---------------------------------------------");
		
		System.out.println("After sorting: ");
		for(int element : a) {
			System.out.println(element);
		}

	}

}
