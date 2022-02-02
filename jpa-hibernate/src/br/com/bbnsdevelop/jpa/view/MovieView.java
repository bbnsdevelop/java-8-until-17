package br.com.bbnsdevelop.jpa.view;

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

}
