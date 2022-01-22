package br.com.bbnsdevelop.movietickets.entities;

public class Ticket {
	
	private int id;
	private String movie;
	private String screen;
	private String seat;
	
	public Ticket() {}

	public Ticket(int id, String movie, String screen, String seat) {
		this.id = id;
		this.movie = movie;
		this.screen = screen;
		this.seat = seat;
	}
	
	public Ticket(String movie, String screen, String seat) {
		this.movie = movie;
		this.screen = screen;
		this.seat = seat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	
	
	
	
	
	

	

}
