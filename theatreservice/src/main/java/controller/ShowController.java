package controller;

import dto.Seat;
import dto.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ShowService;
import service.TheatreService;

import java.util.List;

@RestController("/show/v1")
public class ShowController {

    private ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService=showService;
    }


    @PutMapping
    ResponseEntity<Integer> addShow(Show show) {
        int showId=showService.addUpdateShow(show);
        return ResponseEntity.ok(showId);
    }

    @PatchMapping
    ResponseEntity<Integer> updateShow(Show show) {
        int showId=showService.addUpdateShow(show);
        return ResponseEntity.ok(showId);
    }

    @DeleteMapping("/{showId}")
    ResponseEntity<Void> removeShow(int showId) {
        showService.removeShow(showId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{showId}")
    ResponseEntity<Show> updateSeat(int showId, List<Seat> seats) {
        Show show = showService.addUpdateSeaats(showId, seats);
        return ResponseEntity.ok(show);
    }
}
