package com.casey;

import javax.swing.*;
import java.awt.*;

/**
 * Created by casey on 5/3/15.
 */
public class CalcPanel extends JPanel {
    ModeCanvas modeCanvas = new ModeCanvas();
    ModeDescriptionCanvas modeDescriptionCanvas = new ModeDescriptionCanvas();
    Rt60Canvas rt60Canvas = new Rt60Canvas();

    private JLabel roomModes;
    private JLabel rt60Label;



    public CalcPanel(){
        setVisible(true);
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(1000, 760));
        setFocusable(true);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        roomModes = new JLabel("Room Modes");
        rt60Label = new JLabel("RT60 results");


        //inset and pad size
        c.insets = new Insets(5, 0, 0, 2);
//        c.ipadx = 100;

        //anchor at line start
        c.anchor = GridBagConstraints.CENTER;


        //title
        c.gridx =0;
        c.gridy = 1;
        add(roomModes, c);

        //mode canvas
        c.gridx =0;
        c.gridy = 2;
        add(modeCanvas, c);

        //RT60 label
        c.gridx = 0;
        c.gridy = 4;
        add(rt60Label, c);

        //RT60 canvas
        c.gridx = 0;
        c.gridy = 5;
        add(rt60Canvas, c);

        //description canvas
        c.gridx = 0;
        c.gridy = 7;
        add(modeDescriptionCanvas, c);

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
