package com.booking.ticketbookingservice.service;

import com.booking.ticketbookingservice.dto.Seat;

import java.util.List;

public interface TicketBookingService {

    Integer bookSeats(int ticketId, int showId, List<String> seatNumbers);
}
