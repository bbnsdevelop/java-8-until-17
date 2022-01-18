package br.com.bbnsdevelop.v2_examples.command.tv;

public class Person {
	
	public static void main(String[] args) {
		Television television = new Television();
		
		RemoteControl remoteControl = new RemoteControl();
		OnCommand on =  new OnCommand(television);
		remoteControl.setCommand(on);
		
		remoteControl.pressButton();
		
		
		OffCommand off =  new OffCommand(television);
		remoteControl.setCommand(off);
		
		remoteControl.pressButton();
	}

}
