package br.com.bbnsdevelop.bridge;

import br.com.bbnsdevelop.bridge.bridges.Bridge;
import br.com.bbnsdevelop.bridge.platforms.DisneyPlus;
import br.com.bbnsdevelop.bridge.platforms.Facebook;
import br.com.bbnsdevelop.bridge.platforms.TwichTV;
import br.com.bbnsdevelop.bridge.platforms.YouTube;

public class Main {
	
	public static void main(String[] args) {
		
		Bridge bridge = new Bridge();
		bridge.startLive(new YouTube());
		bridge.startLive(new Facebook());
		bridge.startLive(new TwichTV());
		
		
		System.out.println("-".repeat(50));
		bridge.setComment("Very nice");
		bridge.startAdvancedLive(new TwichTV());
		bridge.startAdvancedLive(new YouTube());
		
		System.out.println("-".repeat(50));
		bridge.startRecordLive(new DisneyPlus());
	}

}
