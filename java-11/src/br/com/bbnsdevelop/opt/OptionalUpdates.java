package br.com.bbnsdevelop.opt;

import java.util.Optional;

public class OptionalUpdates {
	
	public static void main(String[] args) {
		
		Optional<String>  opt = Optional.empty();
		
		System.out.println(opt.isEmpty());
		
		opt = Optional.of("Test");
		
		
		System.out.println(opt.isEmpty());
	}

}
