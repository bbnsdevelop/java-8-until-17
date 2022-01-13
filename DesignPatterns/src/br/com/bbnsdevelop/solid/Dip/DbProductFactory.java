package br.com.bbnsdevelop.solid.Dip;

public class DbProductFactory {

	
	public static IDbProduct create(TypesDb type) {
		if(type.equals(TypesDb.MYSQL)) {
			return new MysqlProduct();			
		}else if(type.equals(TypesDb.MONGODB)){
			return new MongoDbProduct();
		}
		return null;
	}
	
}
