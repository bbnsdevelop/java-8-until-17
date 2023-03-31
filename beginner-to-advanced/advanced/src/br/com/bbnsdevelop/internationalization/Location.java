package br.com.bbnsdevelop.internationalization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Location {
	
	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		
		System.out.println(l.getCountry().concat(" - ").concat(l.getLanguage()));
		System.out.println(l.getDisplayCountry().concat(" - ").concat(l.getDisplayLanguage()));
		
		Locale.setDefault(Locale.UK);
		 l = Locale.getDefault();
		
		System.out.println(l.getCountry().concat(" - ").concat(l.getLanguage()));
		System.out.println(l.getDisplayCountry().concat(" - ").concat(l.getDisplayLanguage()));
		
		
		String[] isoCountries = Locale.getISOCountries();
		List<String> countries = new ArrayList<>(Arrays.asList(isoCountries));
		countries.stream().forEach(System.out::println);
		
		String[] isoLanguages = Locale.getISOLanguages();
		
		System.out.println("--------------------------------------------------");
		List<String> languages = new ArrayList<>(Arrays.asList(isoLanguages));
		
		languages.stream().forEach(System.out::println);
	}

}
