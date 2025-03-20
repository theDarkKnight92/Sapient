package com.booking.ticketbookingservice.controller;

import com.booking.ticketbookingservice.dto.Seat;
import com.booking.ticketbookingservice.dto.Show;
import com.booking.ticketbookingservice.service.TicketBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/ticket/booking")
public class TicketBookingController {

    private TicketBookingService ticketBookingService;

    public TicketBookingController(TicketBookingService ticketBookingService) {
        this.ticketBookingService=ticketBookingService;
    }


    @PutMapping("/show")
    ResponseEntity<Integer> bookShowSeats(Show show) {
        int theatreId=show.getTheatreId();
        int showId=show.getShowId();
        List<String> seatNumbers=show.getSeats().stream().map(Seat::getSeatNumber).collect(Collectors.toList());
        int bookingId=ticketBookingService.bookSeats(theatreId, showId, seatNumbers);
        return ResponseEntity.ok(bookingId);
    }
}
