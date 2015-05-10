package com.casey;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * Created by casey on 4/21/15.
 */
public class Window {

    Room room1;

    //window and door dimensions
    protected double windowWidth;
    protected double windowHeight;
    protected double windowXY = windowHeight * windowWidth;

    //absorption for window
    protected LinkedList<Double> windowRt60;


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

    //window rt60
    public LinkedList<Double> getWindowRt60() { return this.windowRT60(); }
    public void setWindowRt60(LinkedList<Double> windowRt60) {
        this.windowRt60 = windowRt60;
    }


    private LinkedList<Double> windowRT60() {

        LinkedList<Double> windowRT60 = new LinkedList<Double>();
        windowRT60.add(0.35);
        windowRT60.add(0.25);
        windowRT60.add(0.18);
        windowRT60.add(0.12);
        windowRT60.add(0.07);
        windowRT60.add(0.04);

//        room1.setWindowMaterialCoefficients(windowRT60);
        return windowRT60;


    }

    @Override
    public String toString(){
        return "Window width: " + windowWidth +
                " Window height: " + windowHeight +
                " Window area: " + windowXY;
    }
}
