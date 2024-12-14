package service;

import java.util.List;

import models.ParkingSpot;

public class FourWheelerManager extends ParkingSpotManager{

    public FourWheelerManager(List<ParkingSpot> spots){
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        for(ParkingSpot spot : spots){
            if(spot.getIsEmpty()){
                return spot;
            }
        }
        return null;
    }
    
    
}
