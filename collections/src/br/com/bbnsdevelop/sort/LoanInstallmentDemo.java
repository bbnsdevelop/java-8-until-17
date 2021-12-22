package br.com.bbnsdevelop.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoanInstallmentDemo {

	public static void main(String[] args) {

		List<LoanInstallment> loanInstallmentSelected = Arrays.asList(
				new LoanInstallment(18, BigDecimal.valueOf(1500), 1.2),
				new LoanInstallment(13, BigDecimal.valueOf(1500), 1.2),
				new LoanInstallment(13, BigDecimal.valueOf(1500), 1.2),
				new LoanInstallment(12, BigDecimal.valueOf(1500), 1.2),
				new LoanInstallment(12, BigDecimal.valueOf(1500), 1.2),
				new LoanInstallment(12, BigDecimal.valueOf(1500), 1.2),
				new LoanInstallment(11, BigDecimal.valueOf(1500), 1.2));

		
		for (LoanInstallment loanInstallment : loanInstallmentSelected) {
			System.out.println(loanInstallment);
		}

		Set<LoanInstallment> loanInstallmentHash = new HashSet<>(loanInstallmentSelected);
		List<LoanInstallment> loanInstallment = new ArrayList<>(loanInstallmentHash);
		Collections.sort(loanInstallment);
		
		System.out.println("-----------------------------------");

		for (LoanInstallment l : loanInstallment) {
			System.out.println(l);
		}
	}

}
