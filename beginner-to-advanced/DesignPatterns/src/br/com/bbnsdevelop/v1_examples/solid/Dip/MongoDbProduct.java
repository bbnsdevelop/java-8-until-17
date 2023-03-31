package br.com.bbnsdevelop.v1_examples.solid.Dip;

public class MongoDbProduct implements IDbProduct{

	@Override
	public String getProductById(String productId) {
		return "MongoDb: show data about the product ".concat(productId);
	}

}
