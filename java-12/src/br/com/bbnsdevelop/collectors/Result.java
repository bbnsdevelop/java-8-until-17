package br.com.bbnsdevelop.collectors;

import java.util.List;

public class Result {
	
	private Long count;
	private List<Integer> filtered;


	public Result(Long count, List<Integer> filtered) {
		this.count = count;
		this.filtered = filtered;
	}
	
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public List<Integer> getFiltered() {
		return filtered;
	}
	public void setFiltered(List<Integer> filtered) {
		this.filtered = filtered;
	}
	@Override
	public String toString() {
		return "Result [count=" + count + ", filtered=" + filtered + "]";
	}


	
}
