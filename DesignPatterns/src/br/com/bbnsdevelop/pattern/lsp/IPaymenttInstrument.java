package br.com.bbnsdevelop.pattern.lsp;

public interface IPaymenttInstrument {
	
	void validate() throws Exception;
	void collectPayment();

}
