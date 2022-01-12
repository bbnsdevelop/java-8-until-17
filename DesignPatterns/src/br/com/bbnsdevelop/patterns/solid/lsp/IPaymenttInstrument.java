package br.com.bbnsdevelop.patterns.solid.lsp;

public interface IPaymenttInstrument {
	
	void validate() throws Exception;
	void collectPayment();

}
