package service;

import java.util.List;

import enums.VehicleType;
import models.ParkingSpot;

public class ParkingSpotFactory {

    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots){
        if(vehicleType.equals(VehicleType.TWO_WHEELER)){
            return new TwoWheelerManager(spots);
        } else if(vehicleType.equals(VehicleType.FOUR_WHEELER)){
            return new FourWheelerManager(spots);
        }else
            throw new IllegalArgumentException("Invalid vehicle type.");
    }
    
}
