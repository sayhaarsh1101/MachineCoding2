package service;

import java.util.List;

import models.ParkingSpot;
import models.Vehicle;

public abstract class ParkingSpotManager {
    List<ParkingSpot> spots;

    public ParkingSpotManager(List<ParkingSpot> spots){
        this.spots = spots;
    }

    abstract ParkingSpot findParkingSpace();

    public void parkVehicle(Vehicle v){
        ParkingSpot spot = findParkingSpace();
        if(spot != null){
            spot.parkVehicle(v);
        }
    }

    
    

}
