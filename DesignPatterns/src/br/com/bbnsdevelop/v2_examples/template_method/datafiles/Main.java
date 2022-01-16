package br.com.bbnsdevelop.v2_examples.template_method.datafiles;

public class Main {
	
	public static void main(String[] args) {
		DataRenderer renderer = new CSVDataRenderer();
		renderer.render();
		
		System.out.println("-".repeat(50));
		
		renderer = new XMLDataRenderer();
		
		renderer.render();
	}

}
