package br.com.bbnsdevelop.v1_examples.solid.Lsp;

public interface IPaymenttInstrument {
	
	void validate() throws Exception;
	void collectPayment();

}
