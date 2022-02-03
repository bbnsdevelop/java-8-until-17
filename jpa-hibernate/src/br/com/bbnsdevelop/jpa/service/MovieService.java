package br.com.bbnsdevelop.jpa.service;

import java.util.List;

import br.com.bbnsdevelop.jpa.db.FilmeScoreDao;
import br.com.bbnsdevelop.jpa.db.MovieDao;
import br.com.bbnsdevelop.jpa.dto.FilmScore;
import br.com.bbnsdevelop.jpa.entities.Movie;

public class MovieService {

	private static final String NAMEQUERY = "moviesScoreGreaterThan";
	private static final String MOVIE_SCORE = "filmAveragequery";
	
	private MovieDao dao;
	private FilmeScoreDao scoreDao;
	
	public MovieService() {
		this.dao = new MovieDao();
		this.scoreDao = new FilmeScoreDao();
	}
	
	public String save(Movie movie) {
		dao.saveAtomic(movie);
		return "Successfully to save the item order in database id: " + movie.getId();
	}
	
	
	public List<Movie> getMovies(Double score){
		List<Movie> list = dao.find(NAMEQUERY, "score", score);
		return list;		
	}
	
	public FilmScore getScoreMovies() {
		return scoreDao.findOne(MOVIE_SCORE);
	}
	

}
