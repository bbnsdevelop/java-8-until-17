package br.com.bbnsdevelop.v2_examples.template_method;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		
		return "CSV data";
	}

	@Override
	public String processData(String data) {		
		return "Processed: ".concat(data);
	}

}
