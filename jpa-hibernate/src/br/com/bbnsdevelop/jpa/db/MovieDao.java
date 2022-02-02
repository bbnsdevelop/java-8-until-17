package br.com.bbnsdevelop.jpa.db;

import br.com.bbnsdevelop.jpa.entities.Movie;

public class MovieDao extends DAO<Movie>{
	
	public MovieDao() {
		super(Movie.class);
	}

}
