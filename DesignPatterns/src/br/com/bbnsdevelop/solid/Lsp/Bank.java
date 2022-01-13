package br.com.bbnsdevelop.solid.Lsp;

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
