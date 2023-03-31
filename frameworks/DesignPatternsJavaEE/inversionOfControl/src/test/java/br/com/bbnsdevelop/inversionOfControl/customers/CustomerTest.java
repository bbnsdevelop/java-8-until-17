package br.com.bbnsdevelop.inversionOfControl.customers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerTest {
	
	@Autowired
	Customer customer;
	
	@Test
	public void testPayment() {
		customer.pay();
	}

}
