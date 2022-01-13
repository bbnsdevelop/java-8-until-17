package br.com.bbnsdevelop.solid.Lsp;

public interface IPaymenttInstrument {
	
	void validate() throws Exception;
	void collectPayment();

}
