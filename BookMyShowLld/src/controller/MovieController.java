package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Movie;

public class MovieController {

    Map<String, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    public MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }


    public Movie getMovieByName(String movieName){
        for(Movie movie : allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getAllMovies( String city){

        List<Movie> cityMovies = cityVsMovies.get(city);
        return cityMovies;

    }


    public void addMovie(String city, Movie movieName ){
        allMovies.add(movieName);
        List<Movie> movieList = cityVsMovies.getOrDefault(city, new ArrayList<>());

        movieList.add(movieName);
        cityVsMovies.put(city, movieList);

    }
    
    
}
