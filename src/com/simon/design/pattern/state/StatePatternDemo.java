package com.simon.design.pattern.state;

/**
 * Demo class. Everything comes together here.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}