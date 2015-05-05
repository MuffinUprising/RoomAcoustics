package com.casey;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * Created by casey on 4/21/15.
 */
public class Window {

    //window and door dimensions
    protected double windowWidth;
    protected double windowHeight;
    protected double windowXY = windowHeight * windowWidth;

    //absorption for window
    protected double[] windowRt60;


    //constructor
    public Window (double windowWidth, double windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight =windowHeight;

    }

    //getters and setters for window variables
    //width
    public double getWindowWidth() { return windowWidth; }
    public void setWindowWidth(double windowWidth) { this.windowWidth = windowWidth; }

    //height
    public double getWindowHeight() { return windowHeight; }
    public void setWindowHeight(double windowHeight) { this.windowHeight = windowHeight; }

    //window x and y
    public double getWindowXY() { return windowXY; }
    public void setWindowXY(double windowXY) { this.windowXY = windowWidth * windowHeight; }

    //window rt60
    public double[] getWindowRt60() { return windowRt60; }
    public void setWindowRt60(double[] windowRt60) {
        this.windowRt60 = windowRt60;
    }


    private static void windowRT60() {

        LinkedList windowRT60 = new LinkedList<Double>(Arrays.asList(0.35, 0.25, 0.18, 0.12, 0.07, 0.04));

    }

    @Override
    public String toString(){
        return "Window width: " + windowWidth +
                " Window height: " + windowHeight +
                " Window area: " + windowXY;
    }
}
