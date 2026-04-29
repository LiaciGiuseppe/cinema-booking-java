package com.movie.service;

import com.movie.gestional.*;
import java.time.LocalDateTime;

public class CinemaApplication {
    public static void main(String[] args) {
        // 1. Ititialize
        BookingManager manager = new BookingManager();
        
        // 2. Create Database
        User cliente = new Customer(1, "Mario Rossi", "mario@email.it");
        Event film = new Movie("Inception", "Christopher Nolan", LocalDateTime.now().plusDays(1), 10.50);
        Hall sala1 = new Hall(1, 10, 10);

        // 3. Test Ticket buy
        System.out.println("Tentativo di prenotazione 1:");
        manager.makeReservation(cliente, film, sala1, 5, 5);

        System.out.println("\nTentativo di prenotazione 2 (stesso posto):");
        manager.makeReservation(cliente, film, sala1, 5, 5);

        // 4. Resume
        manager.showAllTickets();
    }
}