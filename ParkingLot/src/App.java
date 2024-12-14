import java.util.ArrayList;
import java.util.List;

import enums.VehicleType;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import service.EntranceGate;
import service.ExitGate;
import service.ParkingSpotFactory;

public class App {
    public static void main(String[] args) throws Exception {
        List<ParkingSpot> spots = new ArrayList<>();

        for(int i=1;i<=100;i++){
            if(i<=50){
                spots.add(new ParkingSpot(i, 10));
            } else {
                spots.add(new ParkingSpot(i, 20));
            }
        }

        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();

        EntranceGate entranceGate = new EntranceGate(parkingSpotFactory);
        ExitGate exitGate = new ExitGate(parkingSpotFactory);

        Vehicle vehicle = new Vehicle(123, VehicleType.TWO_WHEELER);
        ParkingSpot spot = entranceGate.getParkingSpot(vehicle, spots);

        Ticket ticket = entranceGate.generateTicket(vehicle, spot);

        long exitTime = System.currentTimeMillis()/1000 + 7200;
        exitGate.processExit(exitTime, ticket);


    }
}
