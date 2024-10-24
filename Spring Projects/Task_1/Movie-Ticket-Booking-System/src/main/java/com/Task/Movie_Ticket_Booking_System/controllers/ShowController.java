package com.Task.Movie_Ticket_Booking_System.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Task.Movie_Ticket_Booking_System.request.ShowRequest;
import com.Task.Movie_Ticket_Booking_System.request.ShowSeatRequest;
import com.Task.Movie_Ticket_Booking_System.services.ShowService;

@RestController
@RequestMapping("/show")
public class ShowController 
{
	
	@Autowired
	private ShowService showService;
	
	//This API is to add new Shows into the system
	@PostMapping("/addNew")
	public ResponseEntity<String> addShow(@RequestBody ShowRequest showRequest)
	{
		try
		{
			String result =showService.addShow(showRequest);
			return new ResponseEntity<>(result, HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	//This API is to associate seats to shows in a theater. 
	@PostMapping("/associateSeats")
	public ResponseEntity<String> associateShowSeats(@RequestBody ShowSeatRequest showSeatRequest)
	{
		try
		{
			String result= showService.associateShowSeats(showSeatRequest);
			return new ResponseEntity<>(result, HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	

}
