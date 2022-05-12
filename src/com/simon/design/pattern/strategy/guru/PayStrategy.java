package com.simon.design.pattern.strategy.guru;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
