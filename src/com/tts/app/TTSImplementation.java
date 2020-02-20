package com.tts.app;

public class TTSImplementation {

	public static void main(String[] args) {
		
		//
		TicketBase ticket = new TicketBase();
		//sets ticket id
		ticket.setId(5);
		//sets ticket type
		ticket.setType("VIP");
		//get ticket id
		System.out.println(ticket.getId());
		//get ticket type
		System.out.println(ticket.getType());
		//print good bye message
		System.out.println("Bye");

	}

}
