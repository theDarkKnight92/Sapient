package dto;

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
}
