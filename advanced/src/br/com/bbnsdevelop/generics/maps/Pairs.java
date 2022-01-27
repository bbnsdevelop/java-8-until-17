package br.com.bbnsdevelop.generics.maps;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pairs<K extends Number, V> {

	private final Set<Pair<K, V>> itens = new LinkedHashSet<>();
	
	public void add(K key, V value) {
		if(key == null) return;
		
		Pair<K, V> newPair = new Pair<>(key, value);
		
		if(itens.contains(newPair)) {
			itens.remove(newPair);
		}
		
		itens.add(newPair);
	}
	
	
	public V getValue(K key) {
		return itens.stream().filter( pair -> key.equals(pair.getKey())).findFirst()
				.orElse(null).getValue();
	}
}
