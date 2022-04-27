package com.simon.design.pattern.defaultadapter;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowsAdapter {

    public static void main(String[] args){
        JFrame frame = new JFrame("Hello");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
            }
        });

    }
}