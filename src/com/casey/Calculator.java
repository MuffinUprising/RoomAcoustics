package com.casey;

import sun.awt.image.ImageWatched;

import java.util.DoubleSummaryStatistics;
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


    public Calculator(){

    }

    public static void roomAbsorptionCalc(Room room1, Door door1, Window window1) {
        double roomVolume = room1.getRoomVolume();
        String wallMaterial = room1.getWallMaterial();
        String floorMaterial = room1.getFloorMaterial();
        String ceilingMaterial = room1.getCeilingMaterial();
        String doorMaterial = door1.getDoorMaterial();
        LinkedList<Double> windowRT60 = window1.getWindowRt60();



    }

    public static void rt60Goal () {

    }

    public static void heightModeCalc (Room room1) {

        LinkedList<Integer> heightModes = new LinkedList<Integer>();

        //get dimensions from Room and determine fundamental
        double height = room1.getRoomHeight();
        System.out.println("Room height: " + height);
        double heightFundamental = 563.5 / height;
        //convert to integer
        int fundamentalInt = (int)Math.round(heightFundamental);
        //add fundamental to linkedlist
        heightModes.add(fundamentalInt);

        //current mode and multiplier values
        double heightCurrentMode;
        int heightMultiplier = 2;
        heightCurrentMode = heightFundamental;

        //while loop to iterate over height modes
        while (heightCurrentMode <= 300) {
            double newMode;
            newMode = heightFundamental * heightMultiplier;
            //convert back to integer
            int newModeInt = (int)Math.round((newMode));
            heightModes.add(newModeInt);
            heightMultiplier++;
            heightCurrentMode = newMode;
        }
        System.out.printf("height modes calculated\n");

        for (int x : heightModes) {

            System.out.println(x + "\n");
        }
        room1.setHeightModes(heightModes);



    }

    public static void widthModeCalc (Room room1) {

        LinkedList<Integer> widthModes = new LinkedList<Integer>();

        //get dimensions from Room and determine fundamental
        double width = room1.getRoomWidth();
        System.out.println("Room width: " + width);
        double widthFundamental = 563.5 / width;
        //convert to integer
        int fundamentalInt = (int)Math.round(widthFundamental);
        //add fundamental to linkedlist
        widthModes.add(fundamentalInt);

        //current mode and multiplier values
        double widthCurrentMode;
        int widthMultiplier = 2;
        widthCurrentMode = widthFundamental;

        //while loop to iterate over width modes
        while (widthCurrentMode <= 300) {
            double newMode;
            newMode = widthFundamental * widthMultiplier;
            //convert back to integer
            int newModeInt = (int)Math.round((newMode));
            widthModes.add(newModeInt);
            widthMultiplier++;
            widthCurrentMode = newMode;
        }
        System.out.printf("width modes calculated\n");

        for(int x : widthModes){
            System.out.println(x + "\n");

        }
        room1.setWidthModes(widthModes);

    }

    public static void lengthModeCalc (Room room1){

        LinkedList<Integer> lengthModes = new LinkedList<Integer>();

        //get dimensions from Room and determine fundamental
        double length = room1.getRoomLength();
        System.out.println("Room length: " + length);
        double lengthFundamental = 563.5 / length;
        //convert to integer
        int fundamentalInt = (int)Math.round(lengthFundamental);
        //add fundamental to linkedlists
        lengthModes.add(fundamentalInt);

        //current mode and multiplier variables
        double lengthCurrentMode;
        int lengthMultiplier = 2;

        //while loop to iterate over length modes
        lengthCurrentMode = lengthFundamental;
        while (lengthCurrentMode <= 300) {
            double newMode;
            newMode = lengthFundamental * lengthMultiplier;
            //convert back to integer
            int newModeInt = (int)Math.round((newMode));
            lengthModes.add(newModeInt);
            lengthMultiplier++;
            lengthCurrentMode = newMode;
        }
        System.out.printf("length modes calculated\n");

        for (int x : lengthModes) {
            System.out.println(x + "\n");
        }
        room1.setLengthModes(lengthModes);

    }

    //room volume calculator
    public static void roomVolumeCalc(Room room1) {
        double roomHeight = room1.getRoomHeight();
        double roomWidth = room1.getRoomWidth();
        double roomLength = room1.getRoomLength();

        double roomVolume = roomHeight * roomWidth * roomLength;
        room1.setRoomVolume(roomVolume);
        System.out.println("Room volume: " + roomVolume);
    }

    //wall area calculator
    public static void wallAbsorption(Room room1) {

        LinkedList<Double> wallRT60 = new LinkedList<Double>();
        double volume = room1.getRoomVolume();

        int freq = 125;
        double roomHeight = room1.getRoomHeight();
        double roomWidth = room1.getRoomWidth();
        double roomLength = room1.getRoomLength();

        double wallArea1 = roomHeight * roomLength;
        double wallArea2 = roomHeight * roomWidth;

        double totalWallArea = ((wallArea1 * 2) + (wallArea2 * 2));

        LinkedList<Double> wallCoefficients = room1.getWallMaterialCoefficients();

        //TODO: null pointer exception
        for (double x : wallCoefficients) {
            double coefficient = x;

            double absorption = totalWallArea * coefficient;
            double rt60 = (0.05 * volume) / absorption;

            System.out.println("Reverb time for " + freq + "Hz is: " + rt60 + " seconds.");
            wallRT60.add(rt60);
            freq = freq * 2;

        }
        System.out.println("Wall RT60 values at frequencies 125, 250, 500, 1k, 2, and 4k: ");
        for (double x : wallRT60) {
            System.out.println(x + ", ");
        }


    }

    //ceiling area calculator
    public static void ceilingAbsorption(Room room1) {

        LinkedList<Double> ceilingRT60 = new LinkedList<Double>();
        double volume = room1.getRoomVolume();

        int freq = 125;

        double roomWidth = room1.getRoomWidth();
        double roomLength = room1.getRoomLength();

        double ceilingArea = roomWidth * roomLength;

        LinkedList<Double> ceilingCoefficients = room1.getCeilingMaterialCoefficients();

        //TODO: null pointer exception
        for (double x : ceilingCoefficients) {
            double coefficient = x;
            double absorption = ceilingArea * coefficient;
            double rt60 = (0.05 * volume) / absorption;

            System.out.println("Reverb time for " + freq + "Hz is: " + rt60 + " seconds.");
            ceilingRT60.add(rt60);
            freq = freq * 2;
        }
        System.out.println("Ceiling RT60 values at frequencies 125, 250, 500, 1k, 2, and 4k: ");
        for (double x : ceilingRT60) {
            System.out.println(x + ", ");
        }



    }

    //floor area calculator
    public static void floorAbsorption(Room room1) {

        LinkedList<Double> floorRT60 = new LinkedList<Double>();
        double volume = room1.getRoomVolume();

        int freq = 125;

        double roomWidth = room1.getRoomWidth();
        double roomLength = room1.getRoomLength();

        double floorArea = roomWidth * roomLength;

        LinkedList<Double> floorCoefficients = room1.getFloorMaterialCoefficients();

        //TODO: null pointer exception
        for (double x : floorCoefficients) {
            double coefficient = x;
            double absorption = floorArea * coefficient;
            double rt60 = (0.05 * volume) / absorption;

            System.out.println("Reverb time for " + freq + "Hz is: " + rt60 + " seconds.");
            floorRT60.add(rt60);
            freq = freq * 2;
        }
        System.out.println("Floor RT60 values at frequencies 125, 250, 500, 1k, 2, and 4k: ");
        for (double x : floorRT60) {
            System.out.println(x + ", ");
        }
    }
}
