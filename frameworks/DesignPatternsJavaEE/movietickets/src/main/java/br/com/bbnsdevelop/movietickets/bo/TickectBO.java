package br.com.bbnsdevelop.movietickets.bo;

public class TickectBO {
	
	private int id;
	private String movieName;
	private String screenNumber;
	private String seatNumber;
	
	public TickectBO() {
	}

	public TickectBO(int id, String movieName, String screenNumber, String seatNumber) {
		this.id = id;
		this.movieName = movieName;
		this.screenNumber = screenNumber;
		this.seatNumber = seatNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}
