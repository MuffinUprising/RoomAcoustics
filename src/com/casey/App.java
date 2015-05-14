package com.casey;

import javax.swing.*;

/**
 * Created by casey on 5/8/15.
 */
//Main
public class App {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();

            }
        });

    }
}
