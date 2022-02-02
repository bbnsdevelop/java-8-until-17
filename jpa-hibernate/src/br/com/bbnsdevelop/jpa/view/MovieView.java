package br.com.bbnsdevelop.jpa.view;

import java.util.List;
import java.util.Scanner;

import br.com.bbnsdevelop.jpa.entities.Actor;
import br.com.bbnsdevelop.jpa.entities.Movie;
import br.com.bbnsdevelop.jpa.service.MovieService;

public class MovieView {
	
	private static MovieService service = new MovieService();
	
	protected static void save() {
		
		Movie movie1 = new Movie("Star Wars Ep 4", 9.5);
		Movie movie2 = new Movie("Matrix Revolution", 10D);
		
		Actor actor1 = new Actor("Harrison Ford");
		Actor actor2 = new Actor("Keanu Reeves");
		
		movie1.addActor(actor1);
		movie1.addActor(actor2);
		
		movie2.addActor(actor2);
		
		String result = service.save(movie1);
		
		System.out.println(result);
	}
	
	
	protected static void findMovies() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type score to find the best movies:");
		Double score = in.nextDouble();
		List<Movie> movies = service.getMovies(score);
		System.out.println("-".repeat(50));
		for (Movie movie : movies) {
			System.out.println("Movie: " + movie.getName());
			for (Actor actor : movie.getActors()) {
				System.out.println("Actor: " + actor.getName());
			}
			System.out.println("-".repeat(50));
		}
		
	}

}
