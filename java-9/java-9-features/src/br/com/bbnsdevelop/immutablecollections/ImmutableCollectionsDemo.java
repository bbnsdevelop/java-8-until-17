package br.com.bbnsdevelop.immutablecollections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionsDemo {

	public static void main(String[] args) {
		
		otherVersionsImmutable();
		
		System.out.println("Java 9");
		List<String> list = List.of("ABC", "Xyz", "123");
		// here has an error, because this list is immutable
		// list.add("12455");
		System.out.println(list);

		// method of not accept values duplicate
		Set<Integer> set = Set.of(1, 3, 4, 6, 8, 7);
		// here has an error, because this list is immutable
		// set.add(10);
		System.out.println(set);

		Map<String, String> map = Map.of("k1", "v1", "k2", "v2", "k3", "v3");

		System.out.println(map);

		Map<String, String> map2 = Map.ofEntries(new AbstractMap.SimpleEntry<>("foo", "a"),
				new AbstractMap.SimpleEntry<>("bar", "b"), new AbstractMap.SimpleEntry<>("baz", "c"));
		
		System.out.println(map2);

	}
	
	public static void otherVersionsImmutable() {

		Set<String> set = new HashSet<>();
		set.add("foo");
		set.add("bar");
		set.add("baz");
		set = Collections.unmodifiableSet(set);
		
		System.out.println(set);
	}

}
