package com.geekbrains;


import javax.swing.*;
import static java.awt.EventQueue.invokeLater;

public class Main {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            public void run() {
                CalculatorWindow frame = new CalculatorWindow();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
