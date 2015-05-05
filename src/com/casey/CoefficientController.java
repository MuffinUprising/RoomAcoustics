package com.casey;

import javax.swing.*;


public class CoefficientController {

    static CoefficientModel db;

    public static void main(String[] args) {

        //Add a shutdown hook.
        AddShutdownHook closeDBConnection = new AddShutdownHook();
        closeDBConnection.attachShutdownHook();
        //Can put code in here to try to shut down the DB connection in a tidy manner if possible

        try {
            CoefficientController controller = new CoefficientController();

            db = new CoefficientModel(controller);

            boolean setup = db.setupDatabase();
            if (setup == false) {
                System.out.println("Error setting up database, see error messages. Clean up database connections.... Quitting program ");

                db.cleanup();

                System.out.println("Quitting program ");

                System.exit(-1);   //Non-zero exit codes indicate errors.
            }

//            new InventoryView(controller).launchUI();
        }

        finally {
            if (db != null) {
                db.cleanup();
            }
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();

            }
        });

    }

}


class AddShutdownHook {
    public void attachShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown hook: program closed, attempting to shut database connection");
                CoefficientController.db.cleanup();
            }
        });
    }
}
