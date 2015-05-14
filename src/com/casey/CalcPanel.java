package com.casey;

import com.sun.javafx.sg.prism.NGShape;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by casey on 5/3/15.
 */
//Right-side calculation panel - where results are intended to be displayed
public class CalcPanel extends JPanel {
    ModeCanvas modeCanvas = new ModeCanvas();
    ModeDescriptionCanvas modeDescriptionCanvas = new ModeDescriptionCanvas();
    Rt60Canvas rt60Canvas = new Rt60Canvas();

    private JLabel roomModes;
    private JLabel rt60Label;

    Room room1;


    public CalcPanel(){
        setVisible(true);
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(1000, 760));
        setFocusable(true);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        roomModes = new JLabel("Room Modes");
        rt60Label = new JLabel("RT60 results");

        //Jbutton to calculate modes
        JButton calcModeButton = new JButton("Calculate Modes");


        //inset and pad size
        c.insets = new Insets(5, 0, 0, 2);
//        c.ipadx = 100;

        //anchor at line start
        c.anchor = GridBagConstraints.CENTER;

        //title
        c.gridx =0;
        c.gridy = 1;
        add(roomModes, c);

        //mode canvas
        c.gridx =0;
        c.gridy = 2;
        add(modeCanvas, c);

        //calculate modes button
        c.gridx = 0;
        c.gridy = 3;
        add(calcModeButton, c);
        calcModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeCanvas.drawHeightModes(room1);
                modeCanvas.drawLengthModes(room1);
                modeCanvas.drawWidthModes(room1);
            }
        });

        //RT60 label
        c.gridx = 0;
        c.gridy = 4;
        add(rt60Label, c);

        //RT60 canvas
        c.gridx = 0;
        c.gridy = 5;
        add(rt60Canvas, c);

        //description canvas
        c.gridx = 0;
        c.gridy = 7;
        add(modeDescriptionCanvas, c);
    }

    public ModeCanvas getModeCanvas() {
        return modeCanvas;
    }

    public void setModeCanvas(ModeCanvas modeCanvas) {
        this.modeCanvas = modeCanvas;
    }

    public Rt60Canvas getRt60Canvas() {
        return rt60Canvas;
    }

    public void setRt60Canvas(Rt60Canvas rt60Canvas) {
        this.rt60Canvas = rt60Canvas;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
