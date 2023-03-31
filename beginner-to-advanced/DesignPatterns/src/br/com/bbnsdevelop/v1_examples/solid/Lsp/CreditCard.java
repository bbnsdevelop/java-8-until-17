package br.com.bbnsdevelop.v1_examples.solid.Lsp;

public class CreditCard extends Bank{
	
	
	@Override
	public void validate() throws Exception {
		System.out.println("Validating limit........");
		System.out.println("Limit it's ok");
	}

}
