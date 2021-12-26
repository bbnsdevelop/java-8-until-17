package br.com.bbnsdevelop.objTotest;

public enum CategoryTypes {
	HOMEAPPLIANCE("home appliance"), COMPUTING("Computing"), SMARTPHONE("Smart Phone"), ;
	
	private String description;
	
	CategoryTypes(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}


}
