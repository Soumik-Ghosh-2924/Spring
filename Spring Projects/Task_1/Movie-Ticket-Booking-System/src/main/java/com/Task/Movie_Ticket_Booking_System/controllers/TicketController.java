package com.Task.Movie_Ticket_Booking_System.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Task.Movie_Ticket_Booking_System.request.TicketRequest;
import com.Task.Movie_Ticket_Booking_System.response.TicketResponse;
import com.Task.Movie_Ticket_Booking_System.services.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController 
{
	
	@Autowired
	private TicketService ticketService;
	
	
	
	//This API is to book tickets for the shows available
	@PostMapping("/book")
	public ResponseEntity<String> ticketBooking (@RequestBody TicketRequest ticketRequest)
	{
		try
		{
			TicketResponse result = ticketService.ticketBooking(ticketRequest);
			return new ResponseEntity<>(result, HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	

}