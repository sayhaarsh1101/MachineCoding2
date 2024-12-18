package models;

import enums.SeatCategory;

public class Seat {
    int id;
    int row;
    SeatCategory seatCategory;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id= id;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }   
    
    public SeatCategory gCategory(){
        return seatCategory;
    }

    public void setCategory(SeatCategory seatCategory){
        this.setCategory(seatCategory);
    }
}
