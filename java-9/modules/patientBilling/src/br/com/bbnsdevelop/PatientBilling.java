package br.com.bbnsdevelop;

import br.com.bbnsdevelop.clinicals.PatientClinicals;
import br.com.bbnsdevelop.entity.Patient;
import br.com.bbnsdevelop.registration.PatientRegistration;

public class PatientBilling {

	public static void main(String[] args) {
		PatientClinicals pc = new PatientClinicals();
		PatientRegistration pr = new PatientRegistration();
		
		Patient p = new Patient("Steven");
		
		pc.doExams(p);
		
		pr.getPatientDetails();
		
	}

}
