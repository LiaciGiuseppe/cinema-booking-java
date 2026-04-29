package com.movie.gestional;

import java.time.LocalDateTime;

public interface Event {
    public String getTitle();
    public LocalDateTime getDateTime();
    public double getBasePrice();

}
