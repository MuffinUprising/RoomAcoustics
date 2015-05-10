package com.casey;

import sun.awt.image.ImageWatched;
import java.util.LinkedList;

import java.util.DoubleSummaryStatistics;

/**
 * Created by casey on 4/21/15.
 */
public class Room {


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
//    protected Double[] roomModes;
    protected LinkedList<Integer>  lengthModes;
    protected LinkedList<Integer> widthModes;
    protected LinkedList<Integer> heightModes;
//    protected Double[] rt60actual;
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
                LinkedList<Integer> heightModes)
    {

        this.roomHeight = roomHeight;
        this.roomWidth = roomWidth;
        this.roomLength = roomLength;
        this.roomVolume = roomHeight * roomWidth * roomLength;

        this.floorMaterial = floorMaterial;
        this.wallMaterial = wallMaterial;
        this.ceilingMaterial = ceilingMaterial;

//        this.roomModes = roomModes;
        this.lengthModes = lengthModes;
        this.widthModes = widthModes;
        this.heightModes = heightModes;
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

    //length modes
    public LinkedList<Integer> getLengthModes() { return lengthModes; }
    public void setLengthModes(LinkedList<Integer> lengthModes) { this.lengthModes = lengthModes; }

    //width modes
    public LinkedList<Integer> getWidthModes() { return widthModes; }
    public void setWidthModes(LinkedList<Integer> widthModes) { this.widthModes = widthModes; }

    //height modes
    public LinkedList<Integer> getHeightModes() { return heightModes; }
    public void setHeightModes(LinkedList<Integer> heightModes) { this.heightModes = heightModes; }

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
