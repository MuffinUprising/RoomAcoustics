package com.casey;

import javax.swing.*;
import java.sql.SQLException;
import java.util.LinkedList;


public class CoefficientController {

    CoefficientModel coefficientModel = new CoefficientModel();
    Room room1;
    Door door1;
    Window window1;



    public void printAll(){

        coefficientModel.printDatabase();
    }

    public void setup(){
        coefficientModel.setupDatabase();
    }


    public void wallMaterial(){ coefficientModel.wallMaterialCoefficients(room1.wallMaterial); }

    public void floorMaterial(){
        coefficientModel.floorMaterialCoefficients(room1.floorMaterial);
    }

    public void ceilingMaterial(){ coefficientModel.ceilingMaterialCoefficients(room1.ceilingMaterial); }

    public void doorMaterial(){ coefficientModel.doorMaterialCoefficients(door1.doorMaterial); }

    public void connect(){
        try{
            coefficientModel.createConnection();

        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}


