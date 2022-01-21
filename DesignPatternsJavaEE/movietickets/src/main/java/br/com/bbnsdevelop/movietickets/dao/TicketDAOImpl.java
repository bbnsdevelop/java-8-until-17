package br.com.bbnsdevelop.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.movietickets.dao.queries.TicketQuery;
import br.com.bbnsdevelop.movietickets.entities.Ticket;

@Repository
public class TicketDAOImpl implements TicketDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TicketQuery query;
	
	@Override
	public String create(Ticket ticket) {
		
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("movie", ticket.getMovie());
		parameters.addValue("screen", ticket.getScreen());
		parameters.addValue("seat", ticket.getSeat());
		
		jdbcTemplate.update(query.save(), parameters);
		
		return "Ticket Purchased successfully";
	}

}
