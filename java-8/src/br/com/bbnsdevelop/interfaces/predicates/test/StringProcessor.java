package br.com.bbnsdevelop.interfaces.predicates.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringProcessor {

	static List<String> filter(List<String> list, Predicate<String> predicate) {
		return list.stream().filter(predicate::test).collect(Collectors.toList());
	}

}
