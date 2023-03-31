package br.com.bbnsdevelop.arrays;

public class TwoDimensionalDemo {
	
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[2][2];
		
		int[][] matrix1 = {{1,2,3,4,5,6,7},{8,9,10}};
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				int element = matrix1[i][j];
				System.out.println(element);
			}
		}
	}

}
