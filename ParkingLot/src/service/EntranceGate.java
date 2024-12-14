package service;

import java.util.List;
import java.util.UUID;

import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;

public class EntranceGate {
    ParkingSpotFactory parkingSpotFactory;

    public EntranceGate(ParkingSpotFactory parkingSpotFactory){
        this.parkingSpotFactory = parkingSpotFactory;
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingSpot> spots){
        ParkingSpotManager pSpotManager = parkingSpotFactory.getParkingSpotManager(vehicle.getVehicleType(), spots);
        return pSpotManager.findParkingSpot();
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
        return new Ticket(UUID.randomUUID().toString(), parkingSpot, System.currentTimeMillis()/1000, vehicle);
    }
    
}
