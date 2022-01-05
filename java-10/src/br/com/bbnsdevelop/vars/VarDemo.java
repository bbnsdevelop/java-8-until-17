package br.com.bbnsdevelop.vars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VarDemo {

	public static void main(String[] args) {
		
		var x = "abc";
		System.out.println(x);
		
		x = "aasas";
		
		System.out.println(x.length());

		var map = new HashMap<String, List<String>>();
		
		map.put("a", Arrays.asList("Alfred", "Ana", "Amelia", "Anthony"));
		map.put("b", Arrays.asList("Benjamin", "Bryson", "Bentley", "Brandon"));
		
		System.out.println(map);
	}

}
