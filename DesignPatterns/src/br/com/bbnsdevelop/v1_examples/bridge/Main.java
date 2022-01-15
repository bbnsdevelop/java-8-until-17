package br.com.bbnsdevelop.v1_examples.bridge;

import br.com.bbnsdevelop.v1_examples.bridge.bridges.Bridge;
import br.com.bbnsdevelop.v1_examples.bridge.platforms.DisneyPlus;
import br.com.bbnsdevelop.v1_examples.bridge.platforms.Facebook;
import br.com.bbnsdevelop.v1_examples.bridge.platforms.TwichTV;
import br.com.bbnsdevelop.v1_examples.bridge.platforms.YouTube;

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
