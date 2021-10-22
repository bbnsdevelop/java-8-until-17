package br.com.bbnsdevelop.basics.logic;

public class LowestValue {

	public static void main(String[] args) {
		int vector[] = { 10, 35, 40, 12, 8, 3, 90, 1 };
		
		int lo = lowestvalue(vector);

		System.out.println(lo);

	}

	public static int lowestvalue(int a[]) {
		int index, lowest;
		lowest = a[0];

		for (index = 1; index < a.length; index++) {
			if (a[index] < lowest) {
				lowest = a[index];
			}
		}
		return lowest;
	}

}
