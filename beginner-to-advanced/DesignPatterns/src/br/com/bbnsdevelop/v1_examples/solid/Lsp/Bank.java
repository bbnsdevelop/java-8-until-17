package br.com.bbnsdevelop.v1_examples.solid.Lsp;

public abstract class Bank implements IPaymenttInstrument {
	
	@Override
	public void validate() throws Exception {
		// basic validate
		
	}
	
	@Override
	public void collectPayment() {
		System.out.println("Payment done");
		
	}

}
