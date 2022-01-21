package br.com.bbnsdevelop.movietickets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketController {
	
	@RequestMapping("/showCreateTicket")
	public String showPageCreateTicket() {
		return "createTicket";
	}

}
