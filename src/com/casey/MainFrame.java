package com.casey;

import javafx.scene.control.SplitPane;
import sun.util.locale.provider.SPILocaleProviderAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.prefs.*;

/**
 * Created by casey on 4/28/15.
 */
public class MainFrame extends JFrame{

    public UserInputPanel userInput;
    public CalcPanel calcPanel;
    public JSplitPane splitPane;
    public JFrame f;

    public MainFrame(){
        super("Reverb Calculator");

        //set layout and location for frame
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        //two panels and one split pane
        userInput = new UserInputPanel();
        calcPanel = new CalcPanel();
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.add(userInput);
        splitPane.add(calcPanel);
        splitPane.setOneTouchExpandable(true);

        //frame building
        f = new JFrame("Reverb Measurement");
        f.setPreferredSize(new Dimension(1200, 760));
        f.setResizable(false);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(splitPane);

        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);

    }
}
