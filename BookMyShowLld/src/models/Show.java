package models;

import java.util.List;

public class Show {
    int id;
    Movie movie;
    List<Integer> bookedSeats;
    Screen screen;
    long startTime;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }


    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public List<Integer> getBookedSeats(){
        return bookedSeats;
    }

    public void setBookedSeats(List<Integer> list){
        this.bookedSeats = list;
    }

    public long getStartTime(){
        return startTime;
    }

    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
}
