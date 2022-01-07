package br.com.bbnsdevelop.collectors;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = n -> Integer.parseInt(n.toString()) > 10;

		Result result = Stream.of(5, 10, 8, 20, 7, 18, 19, 25).collect(Collectors.teeing(Collectors.counting(),
				Collectors.filtering(predicate, Collectors.toList()), Result::new));

		System.out.println(result);
		
	}

}
