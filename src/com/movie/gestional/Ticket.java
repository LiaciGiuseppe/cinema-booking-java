package com.movie.gestional;

import java.util.UUID;

public class Ticket {
    private final String ticketId; // Special ID
    private final User user;
    private final Event event;
    private final Hall hall;
    private final int row;
    private final int col;
    private final double finalPrice;

    public Ticket(User user, Event event, Hall hall, int row, int col) {
        this.ticketId = UUID.randomUUID().toString().substring(0, 8);
        this.user = user;
        this.event = event;
        this.hall = hall;
        this.row = row;
        this.col = col;
        this.finalPrice = event.getBasePrice();
    }

    public void printTicket() {
        System.out.println("--- BIGLIETTO CINEMA ---");
        System.out.println("ID: " + ticketId);
        System.out.println("Spettatore: " + user.getName());
        System.out.println("Evento: " + event.getTitle());
        System.out.println("Sala: " + hall.getId() + " | Posto: " + row + "-" + col);
        System.out.println("Prezzo: €" + finalPrice);
        System.out.println("------------------------");
    }
}
