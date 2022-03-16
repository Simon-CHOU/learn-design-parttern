package com.simon.design.pattern.strategy;

public class Order {
    private int totalCost =0;
    private boolean isClosed = false;
    public void processOrder(PayStrategy strategy){
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
