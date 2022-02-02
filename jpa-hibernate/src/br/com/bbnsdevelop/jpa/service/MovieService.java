package br.com.bbnsdevelop.jpa.service;

import br.com.bbnsdevelop.jpa.db.MovieDao;
import br.com.bbnsdevelop.jpa.entities.Movie;

public class MovieService {
	
	private MovieDao dao;
	
	public MovieService() {
		this.dao = new MovieDao();
	}
	
	public String save(Movie movie) {
		dao.saveAtomic(movie);
		return "Successfully to save the item order in database id: " + movie.getId();
	}
	
	

}
