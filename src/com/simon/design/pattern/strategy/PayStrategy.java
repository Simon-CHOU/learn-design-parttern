package com.simon.design.pattern.strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
