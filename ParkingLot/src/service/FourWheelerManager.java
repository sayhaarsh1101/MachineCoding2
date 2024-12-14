package service;

import java.util.List;

import models.ParkingSpot;

public class FourWheelerManager extends ParkingSpotManager{

    FourWheelerManager(List<ParkingSpot> list) {
        super(list);
    }

    @Override
    ParkingSpot findParkingSpot() {
        for(ParkingSpot spot : list){
            if(spot.getIsEmpty()){
                return spot;
            }
        }
        return null;
    }
    
}
