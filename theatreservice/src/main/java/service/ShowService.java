package service;

import dto.Seat;
import dto.Show;

import java.util.List;

public interface ShowService {

    int addUpdateShow(Show show);

    void removeShow(int showId);

    Show addUpdateSeaats(int showId, List<Seat> seats);
}
