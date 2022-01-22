package br.com.bbnsdevelop.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bbnsdevelop.movietickets.entities.Ticket;
import br.com.bbnsdevelop.movietickets.services.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@RequestMapping("/showCreateTicket")
	public String showPageCreateTicket(ModelMap modelMap) {
		modelMap.remove("msg");
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(Ticket ticket, ModelMap modelMap) {
		String response = service.purchase(ticket);
		
		modelMap.addAttribute("msg", response);
		return "createTicket";
	}

}
