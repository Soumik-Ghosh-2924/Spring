package com.Task.Movie_Ticket_Booking_System.exceptions;

public class TheaterIsExist extends RuntimeException
{
	private static final long serialVersionUID = 6386810783666583528L;

	public TheaterIsExist() {
        super("Theater is already Present on this Address");
    }
	

}
