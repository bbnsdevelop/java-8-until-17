package br.com.bbnsdevelop.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.movietickets.dao.TicketDAO;
import br.com.bbnsdevelop.movietickets.entities.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;
	
	@Override
	public String purchase(Ticket ticket) {	
		
		return dao.create(ticket);
	}

}
