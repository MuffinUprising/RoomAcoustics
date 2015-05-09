package com.casey;

import javax.swing.*;

/**
 * Created by casey on 5/8/15.
 */
public class App {

    public static void main(String[] args) {


        CoefficientController myController = new CoefficientController();

        //to rebuild database
//        myController.setup();
        //connect to database
        myController.connect();


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();

            }
        });

    }
}
