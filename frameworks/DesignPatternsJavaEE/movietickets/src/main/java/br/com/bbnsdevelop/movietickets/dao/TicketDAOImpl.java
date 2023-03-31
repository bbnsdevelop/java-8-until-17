package br.com.bbnsdevelop.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
		
		jdbcTemplate.update(query.save(), ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
		
		return "Ticket ".concat(ticket.getMovie()).concat(" Purchased successfully");
	}

}
