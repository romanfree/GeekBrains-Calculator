package com.geekbrains;

import javax.swing.*;
import java.awt.*;

import static java.awt.EventQueue.invokeLater;

public class CalculatorWindow extends JFrame {
    public CalculatorWindow(){
        setTitle("Калькулятор");
        Panel panel = new Panel();
        add(panel);
        pack();

        int width = 350;
        int height = 350;
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int screenWidth = gd.getDisplayMode().getWidth();
        int screenHeight = gd.getDisplayMode().getHeight();
        setBounds(screenWidth / 2 - width / 2, screenHeight / 2 - height / 2, width, height);

    }

}
