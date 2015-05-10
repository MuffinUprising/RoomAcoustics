package com.casey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Created by casey on 5/2/15.
 */
public class UserInputPanel extends JPanel{

    CoefficientController myController = new CoefficientController();
    Door door1 = new Door(0,0,null);
    Window window1 = new Window(0,0);
    Room room1 = new Room(0,0,0,0,null,null,null,null,null,null,null,null,null);
    Calculator calc = new Calculator();
    ModeCanvas modeCanvas;


    private JLabel roomDimensionsLabel;
    private JLabel heightLabel;
    private JTextField heightTextField;
    private JLabel widthLabel;
    private JTextField widthTextField;
    private JLabel lengthLabel;
    private JTextField lengthTextField;
    private JLabel windowHeightLabel;
    private JTextField windowHeightTextField;
    private JLabel windowWidthLabel;
    private JTextField windowWidthTextField;
    private JLabel doorHeightLabel;
    private JTextField doorHeightTextField;
    private JLabel doorWidthLabel;
    private JTextField doorWidthTextField;
    private JLabel wallMaterialLabel;
    private JComboBox wallMaterialComboBox;
    private JLabel floorMaterialLabel;
    private JComboBox floorMaterialComboBox;
    private JLabel ceilingMaterialLabel;
    private JComboBox ceilingMaterialComboBox;
    private JLabel doorMaterialLabel;
    private JComboBox doorMaterialComboBox;
    private JButton calcModeButton;
    private JButton calcReverbButton;
    private JButton printModes;
    private JButton buildDatabase;

    public UserInputPanel() {
        //dimension variable
        Dimension dim = getPreferredSize();
        dim.width = 250;
        dim.height = 28;

        //panel variables
        setVisible(true);
        setOpaque(true);
        setBackground(Color.GRAY);
        setPreferredSize(dim);
        setMinimumSize(dim);
        setFocusable(true);
        setLayout(new GridBagLayout());

        //h,w,d text fields for room
        roomDimensionsLabel = new JLabel("Room Dimensions");
        heightLabel = new JLabel("Room height");
        heightTextField = new JTextField();
        widthLabel = new JLabel("Room width");
        widthTextField = new JTextField();
        lengthLabel = new JLabel("Room depth");
        lengthTextField = new JTextField();

        //window dimension text field
        windowHeightLabel = new JLabel("Total window height");
        windowHeightTextField = new JTextField();
        windowWidthLabel = new JLabel("Total window width");
        windowWidthTextField = new JTextField();

        //door height text field
        doorHeightLabel = new JLabel("Total door height");
        doorHeightTextField = new JTextField();
        doorWidthLabel = new JLabel("Total door width");
        doorWidthTextField = new JTextField();

        //print database for testing
        printModes = new JButton("Print Modes");

        //materials combo boxes
        //wall
        wallMaterialLabel = new JLabel("Wall material");
        String[] wallMaterials = {"Brick (natural)",
                "Brick (painted) ",
                "Concrete Block (natural)",
                "Concrete Block (painted)",
                "Concrete (poured, unpainted)",
                "Plasterboard",
                "Plaster on masonry",
                "Plaster on wood lathe",
                "Plywood (1/8in.) over 1-1/4 in. airspace",
                "Plywood (1/8in.) over 2-1/4 in. airspace",
                "Plywood (3/16in.) over 2in. airspace",
                "Plywood (3/16in.) over 1in. fiberglass in 2in. airspace",
                "Plywood (1/4in.) with airspace, light bracing)",
                "Plywood (3/8in.) with airspace, light bracing)",
                "Plywood (3/4in.) with airspace, light bracing)",
                "**Absorptive Materials**",
                "Drapery (10 oz/yd2, flat against wall)",
                "Drapery (14 oz/yd2, flat against wall)",
                "Drapery (18 oz/yd2, flat against wall)",
                "Drapery (14 oz/yd2, pleated 50%)",
                "Drapery (18 oz/yd2, pleated 50%)",
                "Fiberglass board (1in.thick)",
                "Fiberglass board (2in. thick)",
                "Fiberglass board (3in. thick)",
                "Fiberglass board (4in. thick)",
                "Open brick pattern over 3 in. fiberglass",
                "Pageboard over 1in. fiberglass board",
                "Pageboard over 2in. fiberglass board",
                "Pageboard over 3in. fiberglass board",
                "Perforated metal (13% open, over 2in. fiberglass)"};
        wallMaterialComboBox = new JComboBox(wallMaterials);

        //floor
        floorMaterialLabel = new JLabel("Floor material");
        String[] floorMaterials = {"Carpet",
                "Concrete (unpainted)",
                "Concrete (painted/sealed)",
                "Marble/Glazed Tile",
                "Vinyl/linoleum tile",
                "Wood on concrete",
                "Wood on joists"};
        floorMaterialComboBox = new JComboBox(floorMaterials);

        //ceiling
        ceilingMaterialLabel = new JLabel("Ceiling material");
        String[] ceilingMaterials = {"Plasterboard (1/2in.) in suspended ceiling grid)",
                "Underlay in perforated metal panels (1in. batts)",
                "Metal deck (perforated channels, 1in. batts)",
                "Metal deck (perforated channels, 3in. batts)",
                "Plaster (gypsum, lime, on masonary)",
                "Plaster (gypsum or lime, rough finish or timber lathe)",
                "Sprayed cellulose fiber (5/8in.) on solid backing)",
                "Sprayed cellulose fiber (1in.) on solid backing)",
                "Sprayed cellulose fiber (1in.) on timber lathe)",
                "Sprayed cellulose fiber (1-1/4in.) on solid backing)",
                "Sprayed cellulose fiber (3in.) on solid backing)",
                "Wood tongue-and-groove roof decking"};
        ceilingMaterialComboBox = new JComboBox(ceilingMaterials);

        //door
        doorMaterialLabel = new JLabel("Door material");
        String[] doorMaterials = {"Doors (solid wood)", "Glass (1/4in. large pane)"};
        doorMaterialComboBox = new JComboBox(doorMaterials);

        //calculation buttons
        calcModeButton = new JButton("Calculate Modes");
        calcReverbButton = new JButton("Calculate reverb time");

        //grid bag constraints variable
        GridBagConstraints c = new GridBagConstraints();

        //set pad size
        c.ipadx = 50;

        c.weightx = 1;
        c.weighty = 0;

        c.fill = GridBagConstraints.NONE;

        //inset size
        c.insets = new Insets(5, 10, 0, 0);
        //anchor at line start
        c.anchor = GridBagConstraints.NORTHWEST;

        //add objects to panel
        //header
        c.gridx = 0;
        c.gridy = 1;
        add(roomDimensionsLabel, c);

        //room height label and text field
        c.gridx = 0;
        c.gridy = 2;
        add(heightLabel,c);
        c.gridx = 0;
        c.gridy = 3;
        add(heightTextField, c);
        heightTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double height = new Double(heightTextField.getText());
                room1.setRoomHeight(height);
                System.out.println("height added to Room");
                calc.heightModeCalc(room1);

            }
        });

        //room width label and text field
        c.gridx = 0;
        c.gridy = 4;
        add(widthLabel,c);
        c.gridx = 0;
        c.gridy = 5;
        add(widthTextField, c);
        widthTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double width = new Double(widthTextField.getText());
                room1.setRoomWidth(width);
                System.out.println("width added to Room");
                calc.widthModeCalc(room1);
            }
        });

        //room depth label and text field
        c.gridx = 0;
        c.gridy = 6;
        add(lengthLabel,c);
        c.gridx = 0;
        c.gridy = 7;
        add(lengthTextField, c);
        lengthTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double length = new Double(lengthTextField.getText());
                room1.setRoomLength(length);
                System.out.println("length added to Room");
                calc.lengthModeCalc(room1);

            }
        });

        //calculate modes button
        c.gridx = 0;
        c.gridy = 8;
        add(calcModeButton, c);
        calcModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.roomVolumeCalc(room1);
//                modeCanvas.drawLengthModes();
//                modeCanvas.drawWidthModes();
//                modeCanvas.drawHeightModes();
//                modeCanvas.repaint();
            }
        });

        //window height label and text field
        c.gridx = 0;
        c.gridy = 9;
        add(windowHeightLabel,c);
        c.gridx = 0;
        c.gridy = 10;
        add(windowHeightTextField, c);
        windowHeightTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double windowHeight = new Double(windowHeightTextField.getText());
                window1.setWindowHeight(windowHeight);
                System.out.println("height added to Window");
            }
        });

        //window width label and text field
        c.gridx = 0;
        c.gridy = 11;
        add(windowWidthLabel,c);
        c.gridx = 0;
        c.gridy = 12;
        add(windowWidthTextField, c);
        windowWidthTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double windowWidth = new Double(windowWidthTextField.getText());
                window1.setWindowWidth(windowWidth);
                System.out.println("width added to Window");
            }
        });

        //door height label and text field
        c.gridx = 0;
        c.gridy = 13;
        add(doorHeightLabel,c);
        c.gridx = 0;
        c.gridy = 14;
        add(doorHeightTextField, c);
        doorHeightTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double doorHeight = new Double(doorHeightTextField.getText());
                door1.setDoorHeight(doorHeight);
                System.out.println("height added to Door");
            }
        });

        //door width label and text field
        c.gridx = 0;
        c.gridy = 15;
        add(doorWidthLabel,c);
        c.gridx = 0;
        c.gridy = 16;
        add(doorWidthTextField, c);
        doorWidthTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double doorWidth = new Double(doorWidthTextField.getText());
                door1.setDoorWidth(doorWidth);
                System.out.println("width added to Door");
            }
        });

        //wall materials label and combo box
        c.gridx = 0;
        c.gridy = 17;
        add(wallMaterialLabel,c);
        c.gridx = 0;
        c.gridy = 18;
        add(wallMaterialComboBox, c);
        wallMaterialComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wallMaterial = wallMaterialComboBox.toString();
                room1.setWallMaterial(wallMaterial);
                System.out.println("wall material added to Room");
                myController.wallMaterial(wallMaterial);
            }
        });

        //floor materials label and combo box
        c.gridx = 0;
        c.gridy = 19;
        add(floorMaterialLabel,c);
        c.gridx = 0;
        c.gridy = 20;
        add(floorMaterialComboBox, c);
        floorMaterialComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String floorMaterial = floorMaterialComboBox.toString();
                room1.setFloorMaterial(floorMaterial);
                System.out.println("floor material added to Room");
                myController.floorMaterial(floorMaterial);
            }
        });

        //ceiling materials label and combo box
        c.gridx = 0;
        c.gridy = 21;
        add(ceilingMaterialLabel,c);
        c.gridx = 0;
        c.gridy = 22;
        add(ceilingMaterialComboBox, c);
        ceilingMaterialComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ceilingMaterial = ceilingMaterialComboBox.toString();
                room1.setCeilingMaterial(ceilingMaterial);
                System.out.println("ceiling material added to Room");
                myController.ceilingMaterial(ceilingMaterial);
            }
        });

        //door materials label and combo box
        c.gridx = 0;
        c.gridy = 23;
        add(doorMaterialLabel,c);
        c.gridx = 0;
        c.gridy = 24;
        add(doorMaterialComboBox, c);
        doorMaterialComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String doorMaterial = doorMaterialComboBox.toString();
                door1.setDoorMaterial(doorMaterial);
                System.out.println("material added to Door");
                myController.doorMaterial(doorMaterial);
            }
        });

        //calculate reverb button
        c.gridx = 0;
        c.gridy = 25;
        add(calcReverbButton, c);
        calcReverbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.wallAbsorption(room1);
                calc.floorAbsorption(room1);
                calc.ceilingAbsorption(room1);
            }
        });

        //print modes button
        c.gridx = 0;
        c.gridy = 26;
        add(printModes, c);
        printModes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: Oddly enough, these do not cause null pointer exceptions - most likely has something to do with Room being instantiated here.
                LinkedList<Integer> heightModes = room1.getHeightModes();
                LinkedList<Integer> widthModes = room1.getWidthModes();
                LinkedList<Integer> lengthModes = room1.getLengthModes();
                System.out.println("height modes: \n");
                for (int x : heightModes) {
                    System.out.println(x + ", ");
                }
                System.out.println("width modes: \n");
                for (int x : widthModes) {
                    System.out.println(x + ", ");
                }
                System.out.println("length modes: \n");
                for (int x : lengthModes) {
                    System.out.println(x + ", ");
                }

            }
        });
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.WHITE);
    }

}
