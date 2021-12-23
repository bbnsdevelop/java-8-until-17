package br.com.bbnsdevelop.list.iterator;

public class Product implements Comparable<Product>{

	private String serialNumber;
	private String name;
	private Double price;
	private int qtd;

	public Product(String serialNumber, String name, double price) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.price = price;
	}

	public Product(String serialNumber, String name, Double price, int qtd) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

	@Override
	public int hashCode() {
		 return serialNumber != null ? serialNumber.hashCode() : 0;
	}

	@Override
	public boolean equals(Object o) {
		 if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

			Product product = (Product) o;

	        return serialNumber != null ? serialNumber.equals(product.serialNumber) : product.serialNumber == null;
	}

	@Override
	public String toString() {
		return "Product [serialNumber=" + serialNumber + ", name=" + name + ", price=" + price + ", qtd=" + qtd + "]";
	}
	
	
	@Override
    public int compareTo(Product p) {

        return this.price.compareTo(p.getPrice());
    }

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	

}
