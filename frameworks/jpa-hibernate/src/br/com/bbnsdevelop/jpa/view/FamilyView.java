package br.com.bbnsdevelop.jpa.view;

import java.util.List;

import br.com.bbnsdevelop.jpa.entities.Nephew;
import br.com.bbnsdevelop.jpa.entities.Uncle;
import br.com.bbnsdevelop.jpa.service.FamilyService;

public class FamilyView {

	private static FamilyService service = new FamilyService();

	protected static void save() {
		Uncle uncle1 = new Uncle("John");
		Uncle uncle2 = new Uncle("Ana");

		Nephew nephew1 = new Nephew("James");
		Nephew nephew2 = new Nephew("Maria");

		uncle1.getNephews().add(nephew1);
		nephew1.getUncles().add(uncle1);

		uncle1.getNephews().add(nephew2);
		nephew2.getUncles().add(uncle1);

		uncle2.getNephews().add(nephew1);
		nephew1.getUncles().add(uncle2);

		uncle2.getNephews().add(nephew2);
		nephew2.getUncles().add(uncle2);

		String result = service.save(List.of(uncle1, uncle2), List.of(nephew1, nephew2));
		System.out.println(result);
	}

}
