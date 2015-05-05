package com.casey;

import javax.swing.*;
import java.awt.*;

/**
 * Created by casey on 5/3/15.
 */
public class CalcPanel extends JPanel {
    ModeCanvas modeCanvas = new ModeCanvas();
    ModeDescriptionCanvas modeDescriptionCanvas = new ModeDescriptionCanvas();

    private JLabel roomModes;



    public CalcPanel(){
        setVisible(true);
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(1000, 800));
        setFocusable(true);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        roomModes = new JLabel("Room Modes");


        //inset and pad size
        c.insets = new Insets(5, 0, 0, 2);
//        c.ipadx = 100;

        //anchor at line start
        c.anchor = GridBagConstraints.CENTER;

        //description canvas
        c.gridx = 0;
        c.gridy = 1;
        add(modeDescriptionCanvas);

        //title
        c.gridx =0;
        c.gridy = 2;
        add(roomModes, c);

        //canvas
        c.gridx =0;
        c.gridy = 3;
        add(modeCanvas, c);

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
