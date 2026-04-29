package com.movie.service;

import com.movie.gestional.*;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private final List<Ticket> issuedTickets;

    public BookingManager() {
        this.issuedTickets = new ArrayList<>();
    }

    public Ticket makeReservation(User user, Event event, Hall hall, int row, int col) {
        try {
            hall.bookSeat(row, col);
            Ticket newTicket = new Ticket(user, event, hall, row, col);
            issuedTickets.add(newTicket);
            
            System.out.println("Successo: Prenotazione completata per " + user.getName());
            return newTicket;
            
        } catch (IllegalStateException e) {
            System.err.println("Errore: " + e.getMessage());
            return null;
        }
    }

    public void showAllTickets() {
        System.out.println("\n--- REGISTRO TOTALE PRENOTAZIONI ---");
        for (Ticket t : issuedTickets) {
            t.printTicket();
        }
    }
}
