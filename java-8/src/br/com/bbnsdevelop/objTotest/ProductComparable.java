package br.com.bbnsdevelop.objTotest;

public class ProductComparable extends Product implements Comparable<ProductComparable> {

	public ProductComparable() {
	}

	public ProductComparable(Integer id, String name, Double price, Integer quantity, CategoryTypes category) {
		super(id, name, price, quantity, category);
	}

	@Override
	public int compareTo(ProductComparable o) {
		return super.getName().compareTo(o.getName());
	}

}
