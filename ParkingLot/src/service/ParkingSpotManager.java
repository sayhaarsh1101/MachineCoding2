package service;

import java.util.List;

import models.ParkingSpot;
import models.Vehicle;

public abstract class ParkingSpotManager {
    List<ParkingSpot> list;

    ParkingSpotManager(List<ParkingSpot> list) {
        this.list = list;
    }

    abstract ParkingSpot findParkingSpot();

    void parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpot();
        spot.parkVehicle(v);
    }

    void removeVehicle(Vehicle v) {
        for(ParkingSpot spot : list){
            if(spot.getVehicle() != null && spot.getVehicle().equals(v)){
                spot.removeVehicle();
                break;
            }      
         }
    }
    
}
