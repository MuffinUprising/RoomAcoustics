package com.casey;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

/**
 * Created by casey on 4/30/15.
 */
public class Calculator {

    // A room mode is a low frequency (below 300Hz) that is resonant in a room given it's dimensions
    // frequency = speed of sound(1127ft/sec) / wavelength
    // wavelength = 2L
    // can be simplified by f = 563.5/L
    // mode 1 = f, mode 2 = mode 1 * 2, mode 3 = mode 1 * 3, etc.. up to 300Hz
    // do for length, width, height
    // any modes that are within 5Hz of a mode from another dimension is considered problematic
    // because these frequencies can meet at points in the room and amplify each other causing "boomy" spots

    protected LinkedList<Double> heightModes;
    protected LinkedList<Double> widthModes;
    protected LinkedList<Double> lengthModes;

    public Calculator(LinkedList heightModes, LinkedList widthModes, LinkedList lengthModes){

        this.heightModes = heightModes;
        this.widthModes = widthModes;
        this.lengthModes = lengthModes;
    }

    //getters
    public LinkedList<Double> getHeightModes() {return heightModes;}
    public LinkedList<Double> getWidthModes() {return widthModes;}
    public LinkedList<Double> getLengthModes() {return lengthModes;}

    public static void roomAbsorptionCalc() {

    }

    public static void rt60Goal () {

    }

    public LinkedList heightModeCalc (Room room1) {

        //LinkedList to store axial modes
        LinkedList<Double> heightModes = new LinkedList<Double>();
        //get dimensions from Room and determine fundamental
        double height = room1.getRoomHeight();
        double heightFundamental = 563.5 / height;
        //add fundamental to linkedlist
        heightModes.add(heightFundamental);

        //current mode and multiplier values
        double heightCurrentMode;
        int heightMultiplier = 2;

        //while loop to iterate over height modes
        heightCurrentMode = heightFundamental;
        while (heightCurrentMode <= 300) {
            double newMode;
            newMode = heightCurrentMode * heightMultiplier;
            heightModes.add(newMode);
            heightMultiplier += 1;
            heightCurrentMode = newMode;
        }
        return heightModes;


    }

    public LinkedList widthModeCalc (Room room1) {

        //LinkedList to store axial modes
        LinkedList<Double> widthModes = new LinkedList<Double>();
        //get dimensions from Room and determine fundamental
        double width = room1.getRoomWidth();
        double widthFundamental = 563.5 / width;
        //add fundamental to linkedlist
        widthModes.add(widthFundamental);

        //current mode and multiplier values
        double widthCurrentMode;
        int widthMultiplier = 2;

        //while loop to iterate over width modes
        widthCurrentMode = widthFundamental;
        while (widthCurrentMode <= 300) {
            double newMode;
            newMode = widthCurrentMode * widthMultiplier;
            widthModes.add(newMode);
            widthMultiplier += 1;
            widthCurrentMode = newMode;
        }

        return widthModes;
    }

    public LinkedList lengthModeCalc (Room room1){

        //LinkedList to store axial modes
        LinkedList<Double> lengthModes = new LinkedList<Double>();
        //get dimensions from Room and determine fundamental
        double length = room1.getRoomLength();
        double lengthFundamental = 563.5 / length;
        //add fundamental to linkedlists
        lengthModes.add(lengthFundamental);

        //current mode and multiplier variables
        double lengthCurrentMode;
        int lengthMultiplier = 2;

        //while loop to iterate over length modes
        lengthCurrentMode = lengthFundamental;
        while (lengthCurrentMode <= 300) {
            double newMode;
            newMode = lengthCurrentMode * lengthMultiplier;
            lengthModes.add(newMode);
            lengthMultiplier += 1;
            lengthCurrentMode = newMode;
        }

        return lengthModes;
    }
}
