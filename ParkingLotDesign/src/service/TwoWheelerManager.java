package service;

import java.util.List;

import models.ParkingSpot;

public class TwoWheelerManager extends ParkingSpotManager{

    public TwoWheelerManager(List<ParkingSpot> spots){
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        for(ParkingSpot spot : spots){
            if(spot != null){
                return spot;
            }
        }
        return null;
    }
    
}
