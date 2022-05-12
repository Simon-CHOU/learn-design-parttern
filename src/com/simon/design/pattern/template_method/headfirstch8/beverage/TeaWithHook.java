package com.simon.design.pattern.template_method.headfirstch8.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Steeping in tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
