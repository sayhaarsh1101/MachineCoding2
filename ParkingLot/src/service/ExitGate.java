package service;

import java.util.ArrayList;

import enums.VehicleType;
import models.Ticket;

public class ExitGate {
    ParkingSpotFactory pSpotFactory;

    public ExitGate(ParkingSpotFactory parkingSpotFactory){
        this.pSpotFactory = parkingSpotFactory;
    }

    public void processExit(long exitTime, Ticket ticket) {
        ParkingSpotManager pSpotManager = pSpotFactory.getParkingSpotManager(ticket.getVehicle().getVehicleType(), new ArrayList<>());

        PricingStrategy pricingStrategy = ticket.getVehicle().getVehicleType() == VehicleType.TWO_WHEELER ? new TwoWheelerPricingStrategy() : new FourWheelerPricingStrategy();

        ComputationContext computationContext = new ComputationContext(pricingStrategy);
        int cost = computationContext.computeCost(ticket.entryTime(), exitTime, 20);

        pSpotManager.removeVehicle(ticket.getVehicle());
        System.out.println("Cost is- " + cost);
    }
    
}
