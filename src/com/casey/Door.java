package com.casey;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by casey on 4/21/15.
 */
//Stores data about a door
public class Door {

    //door dimensions
    protected double doorWidth;
    protected double doorHeight;
    protected double doorXY = doorWidth * doorHeight;

    //door absorption variables
    protected String doorMaterial;
    protected LinkedList<Double> doorMatRt60;

    //constructor
    public Door (double doorWidth, double doorHeight, String doorMaterial) {
        this.doorWidth = doorWidth;
        this.doorHeight = doorHeight;
        this.doorMaterial = doorMaterial;

    }

    //getters and setters for door variables
    //width
    public double getDoorWidth() { return doorWidth; }
    public void setDoorWidth(double doorWidth) { this.doorWidth = doorWidth; }

    //height
    public double getDoorHeight() { return doorHeight; }
    public void setDoorHeight(double doorHeight) { this.doorHeight = doorHeight; }

    //door x and y
    public double getDoorXY() { return doorXY; }
    public void setDoorXY(double doorXY) { this.doorXY = doorWidth * doorHeight; }

    //door material
    public String getDoorMaterial() { return doorMaterial; }
    public void setDoorMaterial(String doorMaterial) { this.doorMaterial = doorMaterial; }

    //door material rt60 variables
    public LinkedList<Double> getDoorMatRt60() { return doorMatRt60; }
    public void setDoorMatRt60(LinkedList<Double> doorMatRt60) { this.doorMatRt60 = doorMatRt60; }


    //TODO: finish method to build door rt60 linkedlist
    private static void doorRT60() {

        LinkedList<Double> doorRT60 = new LinkedList<Double>();
    }

    @Override
    public String toString(){
        return "Door width: " + doorWidth +
                " Door height " + doorHeight +
                " Door area: " + doorXY +
                " Door material: " + doorMaterial;
    }
}
