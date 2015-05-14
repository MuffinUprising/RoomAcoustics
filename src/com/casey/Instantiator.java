package com.casey;

/**
 * Created by casey on 5/14/15.
 */
public class Instantiator {
    Room room1 = new Room(0, 0, 0, 0, null, null, null, null, null,null,null,null,null);
    Door door1 = new Door(0, 0, null);
    Window window1 = new Window(0, 0);
    Calculator calc = new Calculator();
    CoefficientController myController = new CoefficientController(room1);


    public Instantiator(Calculator calc, CoefficientController myController, Door door1, Window window1, Room room1){
        this.calc = calc;
        this.myController = myController;
        this.door1 = door1;
        this.window1 = window1;
        this.room1 = room1;

    }

    //getters and setters
    //calc
    public Calculator getCalc() { return calc; }
    public void setCalc(Calculator calc) { this.calc = calc; }
    //controller
    public CoefficientController getMyController() { return myController; }
    public void setMyController(CoefficientController myController) { this.myController = myController; }
    //door
    public Door getDoor1() { return door1; }
    public void setDoor1(Door door1) { this.door1 = door1; }
    //window
    public Window getWindow1() { return window1; }
    public void setWindow1(Window window1) { this.window1 = window1; }
    //room
    public Room getRoom1() { return room1; }
    public void setRoom1(Room room1) { this.room1 = room1; }

}
