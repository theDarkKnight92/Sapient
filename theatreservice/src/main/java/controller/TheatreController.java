package controller;

import dto.Show;
import dto.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TheatreService;

import java.util.List;
import java.util.Map;

@RestController("/theatre/v1")
public class TheatreController {

    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService=theatreService;
    }

    @PutMapping
    ResponseEntity<Void> addTheatre(Theatre theatre) {
        theatreService.addUpdateTheatre(theatre);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/search")
    ResponseEntity<List<Theatre>> searchTheatres(Theatre theatre) {
        List<Theatre> theatres=theatreService.searchTheatreByCriteria(theatre);
        return ResponseEntity.ok(theatres);
    }
}
