package br.com.bbnsdevelop.services.product;

public class Product{
	
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;
	private CategoryTypes category; 
	

	public Product() {
	}


	public Product(Integer id, String name, Double price, Integer quantity, CategoryTypes category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public static void display(Product p) {
		System.out.println(p);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", category="
				+ category .getDescription()+ "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public CategoryTypes getCategory() {
		return category;
	}


	public void setCategory(CategoryTypes category) {
		this.category = category;
	}

	
}
