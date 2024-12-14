package models;

public class ParkingSpot {

    private String id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private String price;

    public ParkingSpot(String id, boolean isEmpty, Vehicle vehicle, String price) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.price = price;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
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

    public void parkVehicle(Vehicle v){
        this.isEmpty = false;
        this.vehicle = v;
    }

    void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }

}
