package com.booking.ticketbookingservice.dto;

import java.util.Date;
import java.util.List;

public class Show {

    private int showId;

    private int theatreId;

    private Theatre theatre;

    private Movie movie;

    private Date showDateTime;

    private List<Seat> seats;

    private Date lastUpdatedAt;

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getShowDateTime() {
        return showDateTime;
    }

    public void setShowDateTime(Date showDateTime) {
        this.showDateTime = showDateTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
