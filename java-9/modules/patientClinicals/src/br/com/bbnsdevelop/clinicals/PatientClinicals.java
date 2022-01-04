package br.com.bbnsdevelop.clinicals;

import br.com.bbnsdevelop.registration.PatientRegistration;

public class PatientClinicals {
	
	public static void main(String[] args) {
		
		// we need add another module in this;
		//first go to properties, then Java build path finally add another module
		// now you can import class
		
		
		PatientRegistration registration = new PatientRegistration();
		
		registration.registerPatient();
		
		registration.getPatientDetails();
	}

}
