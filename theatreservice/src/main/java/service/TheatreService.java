package service;

import dto.Show;
import dto.Theatre;

import java.util.List;

public interface TheatreService {

    void addUpdateTheatre(Theatre theatre);

    List<Theatre> searchTheatreByCriteria(Theatre theatre);

    void addUpdateShow(int theatreId, Show show);
}
