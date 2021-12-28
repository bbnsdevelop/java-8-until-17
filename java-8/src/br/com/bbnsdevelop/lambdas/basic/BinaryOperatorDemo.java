package br.com.bbnsdevelop.lambdas.basic;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorDemo {

	private static final String DISAPPROVED = "Disapproved";
	private static final String OKAY = "Okay";

	public static void main(String[] args) {

		BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(average.apply(9.8, 8.0));

		BiFunction<Double, Double, String> averageWithReturn = (n1, n2) -> (n1 + n2) / 2 >= 7 ? OKAY : DISAPPROVED;
		System.out.println(averageWithReturn.apply(8.0, 9.0));

		Function<Double, String> concept = m -> m >= 7 ? OKAY : DISAPPROVED;

		System.out.println(average.andThen(concept).apply(8.0, 5.0));

	}

}
