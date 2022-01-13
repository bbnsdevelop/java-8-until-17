package br.com.bbnsdevelop.solid.Lsp;

public class CardRewards implements IPaymenttInstrument {

	@Override
	public void validate() throws Exception {
		System.out.println("Limit OK and Rewards OK");		

	}

	@Override
	public void collectPayment() {
		System.out.println("reward program");


	}

}
