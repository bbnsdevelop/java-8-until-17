package br.com.bbnsdevelop.solid.Dip;

public class Payment {

	public void pay(String productId) {
		IDbProduct dbProduct = DbProductFactory.create(TypesDb.MYSQL);		
		String product = dbProduct.getProductById(productId);		
		System.out.println(product);
		
		
		
		System.out.println("-".repeat(50));		
		dbProduct = DbProductFactory.create(TypesDb.MONGODB);		
		product = dbProduct.getProductById(productId);		
		System.out.println(product);
	}
}
