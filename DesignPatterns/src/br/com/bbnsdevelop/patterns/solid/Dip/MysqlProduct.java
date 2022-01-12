package br.com.bbnsdevelop.patterns.solid.Dip;

public class MysqlProduct implements IDbProduct{
	
	@Override
	public String getProductById(String productId) {		
		return "Mysql: show data about the product ".concat(productId);
	}

}
