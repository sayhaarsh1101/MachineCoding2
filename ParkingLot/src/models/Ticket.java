package models;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    long entryTime;
    ParkingSpot parkingSpot; 

    public Ticket(String ticketId, ParkingSpot parkingSpot, long entryTime, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
    }

    public String getTicketId(){
        return ticketId;
    }

    public void setTicketId(String ticketId){
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setvehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public long entryTime(){
        return entryTime;
    }

    public void setEntryTime(long entryTime){
        this.entryTime = entryTime;
    }

    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }

    public void setParkingSpotId(ParkingSpot parkingSpot){
        this.parkingSpot = parkingSpot;
    }
}
