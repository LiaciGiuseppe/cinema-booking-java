package com.movie.gestional;

import java.time.LocalDateTime;

public class Movie implements Event {
    private final String title;
    private final String director;
    private final LocalDateTime dateTime;
    private final double price;

    public Movie(String title, String director, LocalDateTime dateTime, double price) {
        this.title = title;
        this.director = director;
        this.dateTime = dateTime;
        this.price = price;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public LocalDateTime getDateTime() { return dateTime; }

    @Override
    public double getBasePrice() { return price; }

    // Specific method for Movies
    public String getDirector() { return director; }
}
