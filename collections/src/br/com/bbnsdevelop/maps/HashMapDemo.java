package br.com.bbnsdevelop.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Jhon");
		map.put(1, "Jhon");
		map.put(2, "Tom");
		map.put(3, "Elvis");
		map.put(4, "Arnold");
		
		
		Set<Integer> keys = map.keySet();
		System.out.println("Keys: " + keys);
		
		Collection<String> values = map.values();
		System.out.println("values: " + values);
		
		
		for (Integer key : keys) {
			System.out.println("Key: " + key + " Value: "+ map.get(key));
		}
	}
}
