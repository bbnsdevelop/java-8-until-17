package br.com.bbnsdevelop.v1_examples.bridge.transmissions;

import br.com.bbnsdevelop.v1_examples.bridge.platforms.IPlatform;

public class AdvancedLive extends Live implements IAdcancedLive{
	
	public AdvancedLive (IPlatform platform) {
		super(platform);
	}
	
	
	@Override
	public void subtitles() {
		System.out.println("subtitles enabled on broadcast");
	}
	
	@Override
	public void comments(String msg) {
		System.out.println("Comments: " + msg);
	}

}
