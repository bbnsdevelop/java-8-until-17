package br.com.bbnsdevelop.controllers.utils;

import br.com.bbnsdevelop.views.Command;
import br.com.bbnsdevelop.views.ViewStudentCommand;

public class CommandHelper {

	public Command getCommand(String requestURI) {
		
		if(requestURI.contains("viewStudentDetails.do")) {
			return new ViewStudentCommand();
		}
		return null;
	}

}
