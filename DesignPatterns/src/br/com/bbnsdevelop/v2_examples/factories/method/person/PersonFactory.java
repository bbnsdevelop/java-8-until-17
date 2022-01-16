package br.com.bbnsdevelop.v2_examples.factories.method.person;

public class PersonFactory {
	
	public static IPerson create(Boolean isMale) {
		IPerson p = null;
		
		if(isMale) {
			p = new Male();
		}else {
			p = new Female();
		}
		
		return p;
	}

}
