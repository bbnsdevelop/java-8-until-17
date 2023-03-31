package br.com.bbnsdevelop.generics.inheretance;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		BoxInt number = new BoxInt();
		number.save(15081988);
		
		Integer n = number.open();
		System.out.println(n);
		
		System.out.println("-".repeat(50));
		
		BoxNumber<Double> d = new BoxNumber<>();
		d.save(2.3539);
		Double num = d.open();
		System.out.println(num);
		
		BoxNumber<Integer> boxNumber = new BoxNumber<>();
		boxNumber.save(73728);
		Integer integer = boxNumber.open();
		System.out.println(integer);
	}

}
