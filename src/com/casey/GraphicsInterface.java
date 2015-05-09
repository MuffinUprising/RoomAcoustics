package com.casey;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by casey on 5/7/15.
 */
public abstract class GraphicsInterface extends Graphics{



    public static void drawLengthModes(Graphics g, Calculator calc){

        //TODO: figure out how to pass Graphics to UserInputPanel or find some way to not require Graphics import
        LinkedList<Double> lengthModes = calc.getHeightModes();
        for (double x =0; x < lengthModes.size(); x++) {
            int tempMode = (int)Math.round(x);
            g.setColor(Color.RED);
            g.drawOval(5,5,tempMode,80);

        }

    }

    public static void drawWidthModes(Graphics g, Calculator calc) {

        //TODO: figure out how to pass Graphics to UserInputPanel or find some way to not require Graphics import
        LinkedList<Double> widthModes = calc.getHeightModes();
        for (double x =0; x < widthModes.size(); x++) {
            int tempMode = (int)Math.round(x);
            g.setColor(Color.GREEN);
            g.drawOval(5,5,tempMode,150);

        }

    }

    public static void drawHeightModes(Graphics g, Calculator calc) {

        //TODO: figure out how to pass Graphics to UserInputPanel or find some way to not require Graphics import
        LinkedList<Double> heightModes = calc.getHeightModes();
        for (double x =0; x < heightModes.size(); x++) {
            int tempMode = (int)Math.round(x);
            g.setColor(Color.BLUE);
            g.drawOval(5,5,tempMode,230);

        }

    }
}
