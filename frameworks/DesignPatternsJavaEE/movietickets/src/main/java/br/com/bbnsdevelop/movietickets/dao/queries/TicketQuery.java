package br.com.bbnsdevelop.movietickets.dao.queries;

import org.springframework.stereotype.Component;

@Component
public class TicketQuery {
	
	
	public String save() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("INSERT INTO ticket ");
		sb.append("(movie, screen, seat) ");
		sb.append("VALUES (?, ?, ?)");
		
		return sb.toString();
	}

}
