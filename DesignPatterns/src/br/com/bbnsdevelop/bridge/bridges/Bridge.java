package br.com.bbnsdevelop.bridge.bridges;

import br.com.bbnsdevelop.bridge.platforms.IPlatform;
import br.com.bbnsdevelop.bridge.transmissions.AdvancedLive;
import br.com.bbnsdevelop.bridge.transmissions.Live;
import br.com.bbnsdevelop.bridge.transmissions.RecordLive;

public class Bridge {
	
	private String comment;
	
	public void startLive(IPlatform platform) {
		System.out.println("starting transmission wait.....!!!!");
		Live live = new Live(platform);
		live.broadcasting();
		live.result();
	}
	
	public void startAdvancedLive(IPlatform platform) {
		System.out.println("starting transmission wait.....!!!!");
		AdvancedLive live = new AdvancedLive(platform);
		live.broadcasting();
		live.subtitles();
		live.comments( getComment());
		live.result();
	}
	
	
	public void startRecordLive(IPlatform platform) {
		System.out.println("starting transmission wait.....!!!!");
		RecordLive live = new RecordLive(platform);
		live.broadcasting();
		live.subtitles();
		live.comments( getComment());
		live.result();
		live.record();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
