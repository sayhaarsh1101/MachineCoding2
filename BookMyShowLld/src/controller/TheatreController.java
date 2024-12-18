package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Movie;
import models.Show;
import models.Theatre;

public class TheatreController {

    Map<String, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatres;

    public TheatreController(){
        cityVsTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public Map<Theatre, List<Show>> getAllShows(Movie movie , String city){
        List<Theatre> theatres = cityVsTheatre.get(city);
        List<Show> genShow = new ArrayList<>();
        Map<Theatre, List<Show>> theatreMap = new HashMap<>();

        for(Theatre theatre : theatres){
            List<Show> allShows = theatre.getAllShows();

            for(Show show : allShows){
                if(show.getMovie().equals(movie)) {
                    genShow.add(show);
                }
            }
            theatreMap.put(theatre, genShow);
        }
        return theatreMap;
    }
    
}
