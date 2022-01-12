package br.com.bbnsdevelop.pattern.lsp;

public class BankDemo {

	
	public static void main(String[] args) throws Exception {
		
		CreditCard card = new CreditCard();
		
		card.validate();
		card.collectPayment();
		
		System.out.println("-".repeat(45));
		DebitCard debit = new DebitCard();
		debit.validate();
		debit.collectPayment();
		
		System.out.println("-".repeat(45));
		CardRewards reward = new CardRewards();
		reward.validate();
		reward.collectPayment();
	}
}
