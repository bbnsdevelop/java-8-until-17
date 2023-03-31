package br.com.bbnsdevelop.v2_examples.proxy;

public class Order {
	
	private int id;
	private String productName;
	private int quantity;
	
	public Order() {}

	public Order(int id, String productName, int quantity) {
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", quantity=" + quantity + "]";
	}
	
	

}
