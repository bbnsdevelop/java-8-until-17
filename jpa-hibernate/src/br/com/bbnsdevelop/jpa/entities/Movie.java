package br.com.bbnsdevelop.jpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "name", nullable = false, length = 150)
	private String name;
	
	@Column(nullable = true, precision = 2, scale = 2)
	private Double score;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "actors_movies",  
			joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name ="actor_id", referencedColumnName = "id")
	)
	private List<Actor> acotrs = new ArrayList<>();

	public Movie() {
	}

	public Movie(String name, Double score) {
		this.name = name;
		this.score = score;
	}
	
	
	public void addActor(Actor actor) {
		if(actor != null && noteContainsActor(actor)) {
			getAcotrs().add(actor);
			
			if(noteContainsMovie(actor)) {
				actor.getMovies().add(this);				
			}
		}
	}
	
	private boolean noteContainsActor(Actor actor) {
		return !getAcotrs().contains(actor);
	}
	private boolean noteContainsMovie(Actor actor) {
		return ! actor.getMovies().contains(this);
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public List<Actor> getAcotrs() {
		return acotrs;
	}

	public void setAcotrs(List<Actor> acotrs) {
		this.acotrs = acotrs;
	}


}
