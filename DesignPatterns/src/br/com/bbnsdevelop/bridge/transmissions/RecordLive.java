package br.com.bbnsdevelop.bridge.transmissions;

import br.com.bbnsdevelop.bridge.platforms.IPlatform;

public class RecordLive extends Live implements IAdcancedLive, IRecord {
	
	public RecordLive (IPlatform platform) {
		super(platform);
	}
	

	@Override
	public void record() {
		System.out.println("Live recorded");
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
