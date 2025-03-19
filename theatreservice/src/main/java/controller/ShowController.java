package controller;

import dto.Seat;
import dto.Show;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/show/v1")
public class ShowController {

    @PutMapping
    ResponseEntity<Void> addShow(Show show) {
    }

    @PatchMapping("{/{showId}}")
    ResponseEntity<Void> updateShow(int showId, Show show) {
    }

    @DeleteMapping("/{showId}")
    ResponseEntity<Void> removeShow(int showId) {
    }

    @PutMapping("/{showId}/seat")
    ResponseEntity<Void> updateSeat(int showId, List<Seat> seats) {
    }
}
