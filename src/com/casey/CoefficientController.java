package com.casey;

import javax.swing.*;
import java.sql.SQLException;


public class CoefficientController {

    CoefficientModel coefficientModel = new CoefficientModel();



    public void printAll(){

        coefficientModel.printDatabase();
    }

    public void setup(){
        coefficientModel.setupDatabase();
    }


    public void wallMaterial(String wallMaterial){
        coefficientModel.wallMaterialCoefficients(wallMaterial);
    }

    public void floorMaterial(String floorMaterial){
        coefficientModel.floorMaterialCoefficients(floorMaterial);
    }

    public void ceilingMaterial(String ceilingMaterial){ coefficientModel.ceilingMaterialCoefficients(ceilingMaterial); }

    public void doorMaterial(String doorMaterial){
        coefficientModel.doorMaterialCoefficients(doorMaterial);
    }

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


