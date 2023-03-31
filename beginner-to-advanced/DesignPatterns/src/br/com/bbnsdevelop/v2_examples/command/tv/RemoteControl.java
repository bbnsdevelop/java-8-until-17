package br.com.bbnsdevelop.v2_examples.command.tv;

public class RemoteControl {
	
	private Command command;
	
	
	public void pressButton() {
		this.command.execute();
	}
	

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	

}
