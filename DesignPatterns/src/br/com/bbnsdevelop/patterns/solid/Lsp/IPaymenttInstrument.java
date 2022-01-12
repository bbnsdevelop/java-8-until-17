package br.com.bbnsdevelop.patterns.solid.Lsp;

public interface IPaymenttInstrument {
	
	void validate() throws Exception;
	void collectPayment();

}
