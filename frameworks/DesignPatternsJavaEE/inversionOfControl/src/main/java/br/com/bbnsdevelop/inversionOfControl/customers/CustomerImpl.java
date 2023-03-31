package br.com.bbnsdevelop.inversionOfControl.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bbnsdevelop.inversionOfControl.card.CreditCard;


@Component
public class CustomerImpl implements Customer{
	
	@Autowired
	private CreditCard creditCard; 

	@Override
	public void pay() {
		creditCard.makePayment();
		
	}

}
