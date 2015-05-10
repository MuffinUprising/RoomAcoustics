package com.casey;

import sun.awt.image.ImageWatched;
import java.util.LinkedList;

import java.util.DoubleSummaryStatistics;

/**
 * Created by casey on 4/21/15.
 */
public class Room {

    Window window1;
    Door door1;
//    Calculator calc;

    //room dimensions
    protected double roomHeight;
    protected double roomWidth;
    protected double roomLength;

    //material variables
    protected String floorMaterial;
    protected String wallMaterial;
    protected String ceilingMaterial;

    protected double roomVolume;

//    //measurement variables
    protected LinkedList<Integer>  lengthModes;
    protected LinkedList<Integer> widthModes;
    protected LinkedList<Integer> heightModes;
    protected LinkedList<Double> floorMaterialCoefficients;
    protected LinkedList<Double> wallMaterialCoefficients;
    protected LinkedList<Double> ceilingMaterialCoefficients;
//    protected LinkedList<Double> doorMaterialCoefficients;
//    protected LinkedList<Double> windowMaterialCoefficients;
//    protected Double[] rt60Goal;
//    protected Double[] absorptionNeeded;

    //constructor
    public Room(double roomHeight,
                double roomWidth,
                double roomLength,
                double roomVolume,
                String floorMaterial,
                String wallMaterial,
                String ceilingMaterial,
                LinkedList<Integer> lengthModes,
                LinkedList<Integer> widthModes,
                LinkedList<Integer> heightModes,
                LinkedList<Double> floorMaterialCoefficients,
                LinkedList<Double> wallMaterialCoefficients,
                LinkedList<Double> ceilingMaterialCoefficients
//                LinkedList<Double> doorMaterialCoefficients,
//                LinkedList<Double> windowMaterialCoefficients
                )
    {

        this.roomHeight = roomHeight;
        this.roomWidth = roomWidth;
        this.roomLength = roomLength;
        this.roomVolume = roomHeight * roomWidth * roomLength;

        this.floorMaterial = floorMaterial;
        this.wallMaterial = wallMaterial;
        this.ceilingMaterial = ceilingMaterial;

        this.lengthModes = lengthModes;
        this.widthModes = widthModes;
        this.heightModes = heightModes;
        this.floorMaterialCoefficients = floorMaterialCoefficients;
        this.wallMaterialCoefficients = wallMaterialCoefficients;
        this.ceilingMaterialCoefficients = ceilingMaterialCoefficients;
        this.roomVolume = roomVolume;
//        this.doorMaterialCoefficients = door1.getDoorMatRt60();
//        this.windowMaterialCoefficients = window1.getWindowRt60();
//        this.rt60actual = rt60actual;
//        this.rt60Goal = rt60Goal;
//        this.absorptionNeeded = absorptionNeeded;

    }


    //getters and setter for dimensions
    //height
    public double getRoomHeight() { return roomHeight; }
    public void setRoomHeight(double roomHeight) { this.roomHeight = roomHeight; }

    //width
    public double getRoomWidth() { return roomWidth; }
    public void setRoomWidth(double roomWidth) { this.roomWidth = roomWidth; }

    //length
    public double getRoomLength() { return roomLength; }
    public void setRoomLength(double roomLength) { this.roomLength = roomLength; }

    //wall materal
    public String getWallMaterial() { return wallMaterial; }
    public void setWallMaterial(String wallMaterial) { this.wallMaterial = wallMaterial; }

    //floor material
    public String getFloorMaterial() { return floorMaterial; }
    public void setFloorMaterial(String floorMaterial) { this.floorMaterial = floorMaterial; }

    //ceiling material
    public String getCeilingMaterial() { return ceilingMaterial; }
    public void setCeilingMaterial(String ceilingMaterial) { this.ceilingMaterial = ceilingMaterial; }

    //room volume
    public double getRoomVolume() { return roomVolume; }
    public void setRoomVolume(double roomVolume) { this.roomVolume = roomVolume; }

    //length modes
    public LinkedList<Integer> getLengthModes() {
//        System.out.println("Length modes: \n");
//        for (int x : lengthModes){
//            System.out.println(x + ", ");
//        }
        return lengthModes;
    }
    public void setLengthModes(LinkedList<Integer> lengthModes) { this.lengthModes = lengthModes; }

    //width modes
    public LinkedList<Integer> getWidthModes() {
//        System.out.println("Width modes: \n");
//        for (int x : widthModes) {
//            System.out.println(x + ", ");
//        }
        return widthModes;
    }
    public void setWidthModes(LinkedList<Integer> widthModes) { this.widthModes = widthModes; }

    //height modes
    public LinkedList<Integer> getHeightModes() {
//        System.out.println("Height modes: \n");
//        for (int x : heightModes) {
//            System.out.println(x + ", ");
//        }
        return heightModes;
    }
    public void setHeightModes(LinkedList<Integer> heightModes) { this.heightModes = heightModes; }

    //floor material coefficients
    public LinkedList<Double> getFloorMaterialCoefficients() { return floorMaterialCoefficients; }
    public void setFloorMaterialCoefficients(LinkedList<Double> floorMaterialCoefficients) { this.floorMaterialCoefficients = floorMaterialCoefficients; }

    //door material coefficients
    public LinkedList<Double> getWallMaterialCoefficients() { return wallMaterialCoefficients; }
    public void setWallMaterialCoefficients(LinkedList<Double> wallMaterialCoefficients) { this.wallMaterialCoefficients = wallMaterialCoefficients; }

    //ceiling material coefficients
    public LinkedList<Double> getCeilingMaterialCoefficients() { return ceilingMaterialCoefficients; }
    public void setCeilingMaterialCoefficients(LinkedList<Double> ceilingMaterialCoefficients) { this.ceilingMaterialCoefficients = ceilingMaterialCoefficients; }

    //door material coefficients
//    public LinkedList<Double> getDoorMaterialCoefficients() { return doorMaterialCoefficients; }
//    public void setDoorMaterialCoefficients(LinkedList<Double> doorMaterialCoefficients) { this.doorMaterialCoefficients = doorMaterialCoefficients; }
//
//    //window material (static because windows are made of glass)
//    public LinkedList<Double> getWindowMaterialCoefficients() { return windowMaterialCoefficients; }
//    public void setWindowMaterialCoefficients(LinkedList<Double> windowMaterialCoefficients) { this.windowMaterialCoefficients = windowMaterialCoefficients; }

    public static void lengthModesFromCalc (Calculator calc){

    }

    public static void widthModesFromCalc (){

    }

    public static void heightModesFromCalc (){

    }

    @Override
    public String toString(){
        return "Room height: " + roomHeight +
                " Room width: " + roomWidth +
                " Room length: " + roomLength +
                " Floor material: " + floorMaterial +
                " Wall material " + wallMaterial +
                " Ceiling material " + ceilingMaterial;
    }
}
