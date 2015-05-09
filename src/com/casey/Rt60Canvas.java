package com.casey;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by casey on 5/4/15.
 */
public class Rt60Canvas extends Canvas{

    Calculator calc;

    public Rt60Canvas() {
        setPreferredSize(new Dimension(600, 200));
        setVisible(true);
        setBackground(Color.GRAY);

    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.drawString("RT60 information will go here", 12, 102);

    }

}
