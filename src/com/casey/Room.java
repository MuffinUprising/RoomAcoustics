package com.casey;

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
                String ceilingMaterial)
    {

        this.roomHeight = roomHeight;
        this.roomWidth = roomWidth;
        this.roomLength = roomLength;
        this.roomVolume = roomHeight * roomWidth * roomLength;

        this.floorMaterial = floorMaterial;
        this.wallMaterial = wallMaterial;
        this.ceilingMaterial = ceilingMaterial;

//        this.roomModes = roomModes;
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

    public double getRoomVolume() { return roomVolume; }

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
