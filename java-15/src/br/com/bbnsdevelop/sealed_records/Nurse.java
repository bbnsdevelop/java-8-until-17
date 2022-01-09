package br.com.bbnsdevelop.sealed_records;

public record Nurse() implements Employee {
	
	public int myMethod() {
		// local records
		record Surgical(int id) {
			
		}
		return new Surgical(10).id;
	}

}
