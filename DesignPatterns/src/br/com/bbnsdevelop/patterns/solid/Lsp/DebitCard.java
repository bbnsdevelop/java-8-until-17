package br.com.bbnsdevelop.patterns.solid.Lsp;

public class DebitCard extends Bank {
	
	
	@Override
	public void validate() throws Exception {
		System.out.println("account balance ok!!!");
	}

}
