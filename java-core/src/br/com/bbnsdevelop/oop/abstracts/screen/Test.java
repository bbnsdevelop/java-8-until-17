package br.com.bbnsdevelop.oop.abstracts.screen;

public class Test {
	public static void main(String[] args) {
		DellNotebook dell = new DellNotebook();
		HPNotebook hp = new HPNotebook();

		dell.scroll();
		dell.click();

		hp.scroll();
		hp.click();
	}
}