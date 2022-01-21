package br.com.bbnsdevelop.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bbnsdevelop.movietickets.dao.TicketDAO;
import br.com.bbnsdevelop.movietickets.entities.Ticket;

@Controller
public class TicketController {
	
	@Autowired
	private TicketDAO dao;
	
	@RequestMapping("/showCreateTicket")
	public String showPageCreateTicket() {
		return "createTicket";
	}
	
	public String createTicket(Ticket ticket) {
		dao.create(ticket);
		return "createTicket";
	}

}
