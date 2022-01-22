package br.com.bbnsdevelop.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.movietickets.bo.TickectBO;
import br.com.bbnsdevelop.movietickets.dao.TicketDAO;
import br.com.bbnsdevelop.movietickets.entities.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;
	
	@Override
	public String purchase(TickectBO ticket) {	
		
		return dao.create(convertToTicket(ticket));
	}
	
	private Ticket convertToTicket(TickectBO bo) {
		return new Ticket(bo.getMovieName(), bo.getScreenNumber(), bo.getSeatNumber());
	}

}
