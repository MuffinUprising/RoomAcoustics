package com.casey;

import javax.swing.*;
import java.awt.*;

/**
 * Created by casey on 5/4/15.
 */
public class ModeDescriptionCanvas extends Canvas{

    public ModeDescriptionCanvas(){
        setPreferredSize(new Dimension(600, 100));
        setVisible(true);
        setBackground(Color.GRAY);

    }

    public void paint(Graphics g){

        g.setColor(Color.WHITE);
        g.drawString("Each point plotted on the graph are resonant low frequencies of your room, called modes.", 10, 20);
        g.drawString("Red is length, green is width, blue is height", 10, 50);
        g.drawString("Modes close to each other are considered 'problematic'.", 10, 80);

    }
}
