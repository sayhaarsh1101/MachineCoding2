package models;

public class ParkingSpot {
    int id;
    Vehicle vehicle;
    boolean isEmpty;
    int price;

    public ParkingSpot(int id, int price) {
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }


    public void parkVehicle(Vehicle v) {
        this.vehicle = v;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
    
}
