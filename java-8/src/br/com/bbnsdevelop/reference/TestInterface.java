package br.com.bbnsdevelop.reference;

import br.com.bbnsdevelop.services.product.ProductService;

public class TestInterface {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		
		MyInterfaceRef f = p -> System.out.println(service.getProducts().get(3));		
		f.showProduct(service.getProducts().get(3));

		f = p -> ProductService.updateValueIfCategoryIsSmartPhone(p);	

		f.showProduct(service.getProducts().get(3));		
		f = p -> System.out.println(service.getProducts().get(3));		
		f.showProduct(service.getProducts().get(3));
		
		
		f = service::updateValue;
		f.showProduct(service.getProducts().get(4));
		
		f = p -> System.out.println(service.getProducts().get(4));		
		f.showProduct(service.getProducts().get(4));
	}
	
	
	
	

}
