package service;

public class TwoWheelerPricingStrategy implements PricingStrategy{

    @Override
    public int calculateCost(long entryTime, long exitTime, int hourlyRate) {
        int cost = (int) Math.ceil((exitTime-entryTime)/3600);
        return cost * 30;
    }
    
}
