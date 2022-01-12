package br.com.bbnsdevelop.patterns.solid.Dip;

public class MongoDbProduct implements IDbProduct{

	@Override
	public String getProductById(String productId) {
		return "MongoDb: show data about the product ".concat(productId);
	}

}
