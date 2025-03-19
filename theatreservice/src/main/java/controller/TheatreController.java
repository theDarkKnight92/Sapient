package controller;

import dto.Show;
import dto.Theatre;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("/theatre/v1")
public class TheatreController {

    @PutMapping
    ResponseEntity<Void> addTheatre(Theatre theatre) {
    }


    @GetMapping("/search")
    ResponseEntity<Theatre> searchTheatre(Map<String, String> searchParams) {
    }
}
