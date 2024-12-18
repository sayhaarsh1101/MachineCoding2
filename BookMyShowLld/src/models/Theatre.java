package models;

import java.util.List;

public class Theatre {

    int id;
    String city;
    List<Show> allShows;
    List<Screen> allScreens;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public List<Show> getAllShows(){
        return allShows;
    }

    public void setAllShows(List<Show> list){
        this.allShows = list;
    }

    public List<Screen> getAllScreens(){
        return allScreens;
    }

    public void setAllScreens(List<Screen> list){
        this.allScreens = list;
    }
    
}
