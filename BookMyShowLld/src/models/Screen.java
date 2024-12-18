package models;

import java.util.List;

public class Screen {
    int id;
    List<Seat> allSeats;   

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public List<Seat> getSeats(){
        return allSeats;
    }

    public void setSeats(List<Seat> list){
        this.allSeats = list;
    }
}
