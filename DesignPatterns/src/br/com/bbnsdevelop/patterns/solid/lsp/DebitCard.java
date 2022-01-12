package br.com.bbnsdevelop.patterns.solid.lsp;

public class DebitCard extends Bank {
	
	
	@Override
	public void validate() throws Exception {
		System.out.println("account balance ok!!!");
	}

}
