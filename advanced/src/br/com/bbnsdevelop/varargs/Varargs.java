package br.com.bbnsdevelop.varargs;

import java.util.Collections;
import java.util.List;

public class Varargs {
	
	String firstOfFirst(List<String>... params) {
	    List<String> ints = Collections.singletonList("Five");
	    Object[] objects = params;
	    objects[0] = ints; // Heap pollution

	    return params[0].get(0); // ClassCastException
	}

}
