package br.com.bbnsdevelop.v2_examples.template_method;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		
		return "XML data";
	}

	@Override
	public String processData(String data) {		
		return "Processed: ".concat(data);
	}

}
