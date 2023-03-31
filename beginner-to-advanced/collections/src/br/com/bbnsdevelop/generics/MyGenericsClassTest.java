package br.com.bbnsdevelop.generics;

import java.math.BigDecimal;

import br.com.bbnsdevelop.sort.LoanInstallment;

public class MyGenericsClassTest {

	public static void main(String[] args) {
		MyGenericsClass<String> s = new MyGenericsClass<String>("Snow");

		s.displayObjectDetails();
		String object = s.getObject();
		System.out.println(object);

		System.out.println("-------------------integer------------------------");

		MyGenericsClass<Integer> i = new MyGenericsClass<>(123456);
		i.displayObjectDetails();
		Integer intObject = i.getObject();
		System.out.println(intObject);

		System.out.println("-------------------Double------------------------");

		MyGenericsClass<Double> d = new MyGenericsClass<>(123456.65);
		i.displayObjectDetails();
		Double doubleObject = d.getObject();
		System.out.println(doubleObject);
		
		
		
		System.out.println("-------------------LoanInstallment--Object----------------------");

		MyGenericsClass<LoanInstallment> loan = new MyGenericsClass<>(new LoanInstallment(18, BigDecimal.valueOf(1500), 1.2));
		loan.displayObjectDetails();
		LoanInstallment loanObject = loan.getObject();
		System.out.println(loanObject);

	}
}
