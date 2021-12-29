package br.com.bbnsdevelop.services.student;

public class Average {

	private Double total;
	private Integer quantity;

	public Average add(Double value) {
		total += value;
		quantity++;
		return this;
	}

	public Double getAverage() {
		return total / quantity;
	}

	public Average compose(Average av1, Average av2) {
		Average result = new Average();
		result.total = av1.total + av2.total;
		result.quantity = av1.quantity + av2.quantity;
		return result;
	}

}
