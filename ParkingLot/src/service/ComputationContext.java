package service;

public class ComputationContext {
    PricingStrategy pricingStrategy;

    ComputationContext(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }

    int computeCost(long entryTime, long exitTime, int hourlyRate) {
        return pricingStrategy.calculateCost(entryTime, exitTime, hourlyRate);
    }
    
}
