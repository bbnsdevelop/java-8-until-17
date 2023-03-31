package br.com.bbnsdevelop.sort;

import java.math.BigDecimal;
import java.util.Objects;

public class LoanInstallment implements Comparable<LoanInstallment> {
	
	private Integer deadline;
	private BigDecimal value;
	private Double tax;

	
	public LoanInstallment() {

	}
	
	public LoanInstallment(Integer deadline, BigDecimal value, Double tax) {
		this.deadline = deadline;
		this.value = value;
		this.tax = tax;
	}



	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(deadline);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanInstallment other = (LoanInstallment) obj;
		return Objects.equals(deadline, other.deadline);
	}
	
	

	@Override
	public String toString() {
		return "LoanInstallment [deadline=" + deadline + ", value=" + value + ", tax=" + tax + "]";
	}

	@Override
	public int compareTo(LoanInstallment o) {
		if(this.deadline < o.getDeadline()) {
			return -1;
		}
		return 0;
	}

}
