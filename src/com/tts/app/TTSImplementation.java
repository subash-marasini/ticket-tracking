package com.tts.app;

public class TTSImplementation {

	public static void main(String[] args) {
		TicketBase ticket = new TicketBase();
		ticket.setId(5);
		ticket.setType("VIP");
		System.out.println(ticket.getId());
		System.out.println(ticket.getType());
		System.out.println("Bye");

	}

}
