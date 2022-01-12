package br.com.bbnsdevelop.pattern.lsp;

public class DebitCard extends Bank {
	
	
	@Override
	public void validate() throws Exception {
		System.out.println("account balance ok!!!");
	}

}
