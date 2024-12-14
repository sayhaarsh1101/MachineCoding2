package service;

public interface PricingStrategy {
    int calculateCost(long entryTime, long exitTime, int hourlyRate);
    
}
