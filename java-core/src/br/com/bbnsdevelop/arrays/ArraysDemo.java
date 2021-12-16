package br.com.bbnsdevelop.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Elements from array:");
		for (int i = 0; i < array1.length; i++) {
			int element = array1[i];
			System.out.println("number: " + element);
		}

		System.out.println("----------------------------------");
		int array2[] = new int[5];
		array2[0] = 1;
		array2[1] = 2;
		array2[2] = 3;
		array2[3] = 4;
		array2[4] = Integer.valueOf(5); // Autoboxing

		for (int i = 0; i < array2.length; i++) {
			int element = array2[i];
			System.out.println(element);
		}
	}

}
